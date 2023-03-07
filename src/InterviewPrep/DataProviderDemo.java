package InterviewPrep;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;



public class DataProviderDemo {
	
	
	@Test(dataProvider="testData")
	public void Test(double user,double pwd) {
			System.out.println("this is a new test");
			
			System.out.println(user+pwd);
	}
	
	@DataProvider
	public Object[][] testData() {
		
		
		return new Double[][] {
			{(double) 2134234,(double) 234234},
			{(double) 2134234,(double) 234234},
			{(double) 2134234,(double) 234234},
		};
	}
	
	

	

}
