package testRestassured;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstantiateIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> stAr = new ArrayList<String>(); 
		
		stAr.add("Kanjay");
		
		stAr.add("Adaki");
		
		stAr.add("Novika");
		
		stAr.add("Poorvika");
		
		System.out.println(stAr);
		
		
		Collections.sort(stAr,Collections.reverseOrder());
		
		System.out.println(stAr);
		
		String str = "/acme?acme_form_type=pm360&itrModule=talent&_s.crb=yCTdP5lBWSAWGI9FhT0xahRg6c%252bk10S1YOZj22T%252bTP8%253d";
		
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(str);
		
		
		

	}

}
