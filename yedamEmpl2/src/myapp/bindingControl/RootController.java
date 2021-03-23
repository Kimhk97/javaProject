package myapp.bindingControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML
	private Slider slider;
	@FXML
	private Label label;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			//valueProperty -> 속성값을 읽어온다 / addListener -> 처리에 대한 반응 / changeListener -> 인터페이스
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//obeservableValue -> 자리를 지키고 있다가 값이 변경되면 불러옴 / Number old -> 기존의 값 / Number new -> 변경된 값
				label.setFont(new Font(newValue.doubleValue())); //label의 폰트 변경. slider의 변경된 value값 인식
//				System.out.println("old: " + oldValue + " new: " + newValue); -> 슬라이드 움직일 때마다 값을 볼 수 있음
			}
		});
	}
}
