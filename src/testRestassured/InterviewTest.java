package testRestassured;

public class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
					 
		//System.out.println(str.indexOf("n"));
		
		/*
		 * str = str.toLowerCase();
		 * 
		 * boolean unique = true;
		 * 
		 * for(int i=0;i<str.length();i++) { unique = true; for(int
		 * j=0;j<str.length();j++) {
		 * 
		 * if(str.charAt(i)==str.charAt(j)& i!=j) {
		 * 
		 * unique = false; break; } } if(unique) { System.out.println(str.charAt(i));
		 * break; }
		 * 
		 * }
		 */
		
		char unique ;
		//char loopunique;
		String str = "Snanjdyayadajkis";
		String temp = "";
		str = str.toLowerCase();
		StringBuffer buffercharStr ;
		for(int i=0;i<str.length();i++) {
			
			
			unique = str.charAt(i);
			//buffercharStr = new StringBuffer(str);
			//buffercharStr.replace(i, i+1, "");
			
			
			
			if(str.lastIndexOf(unique)==-1 & str.lastIndexOf(unique)!=i) {
				
				System.out.println(unique);
				break;
			}
			/*
			 * if(buffercharStr.indexOf(""+unique)==-1) {
			 * 
			 * System.out.println(unique); break; }
			 */
			
			
			
		}

	}

}
