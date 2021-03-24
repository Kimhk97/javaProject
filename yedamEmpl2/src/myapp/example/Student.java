package myapp.example;

import javafx.beans.property.SimpleStringProperty;

public class Student {
	SimpleStringProperty name;
	SimpleStringProperty korean;
	SimpleStringProperty math;
	SimpleStringProperty english;
	
//	public void InputStudent() {
//		name = new SimpleStringProperty();
//		korean = new SimpleStringProperty();
//		math = new SimpleStringProperty();
//		english = new SimpleStringProperty();
//	}

	//이름
	public SimpleStringProperty nameProperty() {
		return this.name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getName() {
		return this.name.get();
	}
	
	//국어
	public SimpleStringProperty koreanProperty() {
		return this.korean;
	}

	public void setKorean(String korean) {
		this.name.set(korean);
	}

	public String getKorean() {
		return this.korean.get();
	}
	
	//수학
	public SimpleStringProperty mathProperty() {
		return this.math;
	}

	public void setMath(String math) {
		this.name.set(math);
	}

	public String getMath() {
		return this.math.get();
	}
	
	//영어
	public SimpleStringProperty englishProperty() {
		return this.english;
	}

	public void setEnglish(String english) {
		this.name.set(english);
	}

	public String getEnglish() {
		return this.english.get();
	}
	
}
