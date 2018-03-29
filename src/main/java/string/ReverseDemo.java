package string;

public class ReverseDemo {

	public static void main(String[] args) {
		
		String rev="";
		String s = "Selenium";
		int len = s.length();
		
		for(int i=len-1;  i>=0;i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
