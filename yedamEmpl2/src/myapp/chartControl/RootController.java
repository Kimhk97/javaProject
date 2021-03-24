package myapp.chartControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.chart.XYChart;

public class RootController implements Initializable {
	@FXML
	PieChart pieChart;
	
	@FXML
	BarChart<String, Integer> barChart;
	
	@FXML
	AreaChart<String, Integer> areaChart;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<Data> pieList = FXCollections.observableArrayList();
		pieList.add(new PieChart.Data("Java", 30));
		pieList.add(new PieChart.Data("HTML", 25));
		pieList.add(new PieChart.Data("JavaScript", 45));		
		pieChart.setData(pieList);
		
		//barChart
		//XYChart <- Series1, Series2, Series3 등등 들어감
		//barChart 형식 -> Series를 구성하는 Data 삽입 (한 Series에 다양한 값이 있기 때문에)
		XYChart.Series<String, Integer> series1 = new XYChart.Series<String, Integer>(); //data를 담은 series 구성
		ObservableList<XYChart.Data<String, Integer>> data1 = FXCollections.observableArrayList(); //series에 들어가는 data 구성
		data1.add(new XYChart.Data<String, Integer>("임성원", 30)); //data 작성
		data1.add(new XYChart.Data<String, Integer>("정준영", 20));
		data1.add(new XYChart.Data<String, Integer>("도왕락", 35));
		series1.setData(data1); //작성한 data1 묶음을 series1에 담기
		series1.setName("국어"); //헷갈리니까 이름 붙여주기. ppt로 치면 범주 설정
		
		XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>(); 
		ObservableList<XYChart.Data<String, Integer>> data2 = FXCollections.observableArrayList();
		data2.add(new XYChart.Data<String, Integer>("임성원", 35));
		data2.add(new XYChart.Data<String, Integer>("정준영", 22));
		data2.add(new XYChart.Data<String, Integer>("도왕락", 45));
		series2.setData(data2);
		series2.setName("영어");
		
		XYChart.Series<String, Integer> series3 = new XYChart.Series<String, Integer>(); 
		ObservableList<XYChart.Data<String, Integer>> data3 = FXCollections.observableArrayList();
		data3.add(new XYChart.Data<String, Integer>("임성원", 55));
		data3.add(new XYChart.Data<String, Integer>("정준영", 29));
		data3.add(new XYChart.Data<String, Integer>("도왕락", 33));
		series3.setData(data3);
		series3.setName("수학");
		
		barChart.getData().add(series1); //data 불러와서 보여주기. 이거 안 해주면 차트에 안 나옴!
		barChart.getData().add(series2);
		barChart.getData().add(series3);
		
		//areaChart
		
		
	}

}
