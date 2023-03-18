package testRestassured;

public class TestIUnput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,6,7,8,9,10};
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=i+1) {
				System.out.println(i+1);
				
			}
			
		}

	}

}
