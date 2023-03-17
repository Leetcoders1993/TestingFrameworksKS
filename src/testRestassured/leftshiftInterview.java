package testRestassured;

public class leftshiftInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Unify";
		
		
		
		String temp = str;
		int n = 10;
		
		
		StringBuffer st;
		
		for(int i=0;i<n;i++) {
			
			st = new StringBuffer(temp);
			
			temp = st.replace(0, 1, "").toString()+ temp.charAt(0);
			
			System.out.println(temp);
			
		}

	}

}
