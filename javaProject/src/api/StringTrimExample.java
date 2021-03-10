package api;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "     1234    ";
		String tel4 = "  12    34   "; //중간공백은 무시 못 하는 trim
		
		System.out.println(tel1 + tel2 + tel3 + tel4);
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim() + tel4.trim(); //앞뒤공백무시. 중간은 무시 안 함
		System.out.println(tel);
	}

}
