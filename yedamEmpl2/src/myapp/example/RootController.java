package myapp.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML
	TableView<Student> tableView;
	
	@FXML
	Button addButton;
	
	@FXML private TextField txtName, txtKorean, txtMath, txtEnglish;
	
	
	private Stage primaryStage;
	public void setPrimaryStage(Stage priamryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override 
	public void initialize(URL arg0, ResourceBundle arg1) {	
		public void handleBtnRegAction(ActionEvent e) {
			String name = txtName.getText();
			System.out.println("name: " + name);
			
			String korean = txtKorean.getText();
			System.out.println("korean: " + korean);
			
			String math = txtMath.getText();
			System.out.println("math: " + math);
			
			String english = txtEnglish.getText();
			System.out.println("english: " + english);
			
			Student st = new Student();
			st.setName(name);
			st.setKorean(korean);
			st.setMath(math);
			st.setEnglish(english);
			
//			InputDAO.insertBoard(bo); 연결해야 하는데
			
			//초기화
			txtName.setText("");
			txtKorean.setText("");
			txtMath.setText("");
			txtEnglish.setText("");
		}
		
		public void handleBtnCancelAction(ActionEvent e) {
			Platform.exit();
		}
		
	}

		
		TableColumn<Student, String> tcName = new TableColumn<BoardVO, String>("이름");
		tcName.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("name"));
		tableView.getColumns().add(0, tcName); //람다식	
		
		TableColumn<BoardVO, String> tcKorean = new TableColumn<BoardVO, String>("국어");
		tcKorean.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("korean"));
		tableView.getColumns().add(1, tcKorean);
		
		TableColumn<BoardVO, String> tcMath = new TableColumn<BoardVO, String>("수학");
		tcMath.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("math"));
		tableView.getColumns().add(2, tcMath);
		
		TableColumn<BoardVO, String> tcEnglish = new TableColumn<BoardVO, String>("영어");
		tcEnglish.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("english"));
		tableView.getColumns().add(3, tcEnglish);	

				
		tableView.setItems(list);
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<BoardVO>() {
			@Override
			public void changed(ObservableValue<? extends BoardVO> arg0, BoardVO oldValue, BoardVO newValue) {
				if (newValue != null) {
				name.setText(String.valueOf(newValue.getBoardNo()));
				korean.setText(String.valueOf(newValue.getTitle()));
				math.setText(String.valueOf(newValue.getContents()));
				}
			}});
	}
	
	public void updateButtonAction(ActionEvent e) { //업데이트버튼
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setTitle(title.getText());
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.updateBoard(vo);		
		
		tableView.setItems(InputDAO.boardList());
	}
	
	public void deleteButtonAction(ActionEvent e) { //삭제버튼
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setTitle(title.getText());
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.deleteBoard(vo);	
		
		tableView.setItems(InputDAO.boardList());
	}
	
	public void addButtonAction(ActionEvent e) { //추가버튼
		Stage stage = new Stage(StageStyle.DECORATED);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		
		try {
			AnchorPane ap = FXMLLoader.load(getClass().getResource("BoardAdd.fxml"));
			Scene scene = new Scene(ap);
			stage.setScene(scene);
			stage.show();
			
			Button buttonReg = (Button) ap.lookup("#btnReg");
			Button buttonCancel = (Button) ap.lookup("#btnCancel");
			
			buttonReg.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					TextField txtTitle = (TextField) ap.lookup("#txtTitle");
					TextField txtPassword = (TextField) ap.lookup("#txtPassword");
					ComboBox comboPublic = (ComboBox) ap.lookup("#comboPublic");
					DatePicker dateExit = (DatePicker) ap.lookup("#dateExit");
					TextArea txtContent = (TextArea) ap.lookup("#txtContent");
					InputBoardVO vo = new InputBoardVO();
					
					vo.setTitle(txtTitle.getText());
					vo.setPasswd(txtPassword.getText());
					vo.setPublicity(comboPublic.getValue().toString());
					vo.setExitDate(dateExit.getValue().toString());
					vo.setContents(txtContent.getText());
					
					InputDAO.insertBoard(vo);
					tableView.setItems(InputDAO.boardList());
					stage.close();
				}			
			});
			
			buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					stage.close();
				}			
			});
					
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}



