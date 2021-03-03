package objects2;

public class Calculator { //기능 정리를 위한 클래스
	double pi =  3.14;
	
	public double getArea(double radius) { //static이 없음. new라는 키워드를 이용해서 인스턴스가 하나 있어야 함. 그래야 기능할 준비가 됨.
		double result = pi * radius * radius;
		return result;
	}
	
	public static double getRect(double d1, double d2) { //static이 있으면 클래스를 들고 올 때 getRect()의 이름으로 사용 준비가 되어 있음.
		double result = d1 * d2;
		return result;
	}

	
}
