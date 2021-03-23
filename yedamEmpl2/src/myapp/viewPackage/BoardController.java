package myapp.viewPackage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import common.BoardVO;
import common.InputBoardVO;
import common.InputDAO;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class BoardController implements Initializable {
	@FXML
	TableView<BoardVO> tableView;
	
	@FXML
	TextField boardNo;
	
	@FXML
	TextField title;
	
	@FXML
	ComboBox<String> publicity;
	
	@FXML
	DatePicker exitDate;
	
	@FXML
	TextField contents;
	
	@FXML
	Button updateButton, deleteButton, addButton;
	
	private Stage primaryStage;
	public void setPrimaryStage(Stage priamryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override 
	public void initialize(URL arg0, ResourceBundle arg1) {
//		//이렇게도 할 수 있어욤!
//		tableView.setPrefHeight(600);
//		tableView.setPrefWidth(450);
//		tableView.setLayoutX(30);
//		tableView.setLayoutY(30);
		
		ObservableList<BoardVO> list = InputDAO.boardList();
		
		deleteButton.setOnAction(e -> deleteButtonAction(e)); //RootBoard에 추가하는 대신
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				addButtonAction(e);
							}			
		});
		
		TableColumn<BoardVO, Integer> tcBoardNo = (TableColumn<BoardVO, Integer>) tableView.getColumns().get(0);
		tcBoardNo.setCellValueFactory(new PropertyValueFactory<BoardVO, Integer>("boardNo"));
		
		TableColumn<BoardVO, String> tcTitle = (TableColumn<BoardVO, String>) tableView.getColumns().get(1);
		tcTitle.setCellValueFactory(new Callback<CellDataFeatures<BoardVO, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(CellDataFeatures<BoardVO, String> param) {
				return param.getValue().titleProperty();
			}}); //정석
		
		TableColumn<BoardVO, String> tcPw = new TableColumn<BoardVO, String>("비밀번호");
		tcPw.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("passwd"));
		tableView.getColumns().add(2, tcPw); //람다식	
		
		TableColumn<BoardVO, String> tcPub = new TableColumn<BoardVO, String>("공개여부");
		tcPub.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("publicity"));
		tableView.getColumns().add(3, tcPub); 
		
		TableColumn<BoardVO, String> tcDate = new TableColumn<BoardVO, String>("종료일자");
		tcDate.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("exitDate"));
		tableView.getColumns().add(4, tcDate);
			
		TableColumn<BoardVO, String> tcContents = (TableColumn<BoardVO, String>) tableView.getColumns().get(5);
		tcContents.setCellValueFactory(new Callback<CellDataFeatures<BoardVO, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(CellDataFeatures<BoardVO, String> param) {
				return param.getValue().contentsProperty();
			}});
				
		tableView.setItems(list);
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<BoardVO>() {
			@Override
			public void changed(ObservableValue<? extends BoardVO> arg0, BoardVO oldValue, BoardVO newValue) {
				if (newValue != null) {
				boardNo.setText(String.valueOf(newValue.getBoardNo()));
				title.setText(String.valueOf(newValue.getTitle()));
				contents.setText(String.valueOf(newValue.getContents()));
				exitDate.setValue(LocalDate.parse(newValue.getExitDate()));				
				publicity.setValue(newValue.getPublicity());
				}
			}});
	}
	
	public void updateButtonAction(ActionEvent e) {
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setTitle(title.getText());
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.updateBoard(vo);		
		
		tableView.setItems(InputDAO.boardList());
	}
	
	public void deleteButtonAction(ActionEvent e) {
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setTitle(title.getText());
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.deleteBoard(vo);	
		
		tableView.setItems(InputDAO.boardList());
	}
	
	public void addButtonAction(ActionEvent e) {
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



