package operators;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) / 2.0 * height; //사다리꼴 구하는 공식
		System.out.println("area1 : " + area); //정석방법
		
		area = getRectArea(lengthTop, lengthBottom, height); //return 시켜서 구하는 방식
		System.out.println("area2: " + area);
	}
	//사다리꼴 넓이를 구하는 메소드
	public static double getRectArea(int top, int bottom, int height) {
		double area = (double) (top + bottom) / 2 * height; //먼저 더블 선언 후 계산
		return area;
	}
	

}
