package myapp.buttonControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable { //Initializable 메소드 실행
	@FXML
	Button btn1, btn2, btn3; //FXML에 받아와서
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) { //actionEvent 구현
				handleBtn1Action(arg0);
//				System.out.println("버튼1 클릭");
			}			
		});
		
		btn2.setOnAction(event -> handleBtn2Action(event)); //람다식표현. 위랑 똑같음
		btn3.setOnAction(event -> handleBtn3Action(event));
		
//		btn3.setOnAction(event -> Platform.exit()); //platform -> exit(종료)로.
	}
	
	//코드가 길어질 수도 있으니 setOnAction 메소드에 실행되는 부분을 따로 옮겨오자
	public void handleBtn1Action(ActionEvent e) { 
		System.out.println("버튼1 클릭");
	}
	
	public void handleBtn2Action(ActionEvent e) { 
		System.out.println("버튼2 클릭");
	}
	
	public void handleBtn3Action(ActionEvent e) {
		System.out.println("버튼3 클릭");
		Platform.exit(); //platform -> exit(종료)로.
	}
	
}
