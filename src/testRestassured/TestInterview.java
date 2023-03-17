package testRestassured;

public class TestInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "sagdfsdgkj2542354!@";
		
		String Chars = str.replaceAll("[^a-z]","");
		
		String numbers = str.replaceAll("[^0-9]", "");
		
		String specialChars = str.replaceAll("[a-z0-9]", "");
		
		
		System.out.println(specialChars);
		
		

	}

}
