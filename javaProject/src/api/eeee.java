package api;

public class eeee {
	public static void main(String[] args) {
		Car car = new Car(); //인스턴스 먼저 선언 후 getClass
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName()); 
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("api.Car"); //인스턴스 선언 없이 바로 forName으로 불러오기
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
