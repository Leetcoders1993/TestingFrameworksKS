package testRestassured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import groovy.util.MapEntry;

public class IteratorMapListArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List Iterator 
		
		List<String> str = new  ArrayList<String>();
		
		str.add("sanjay");str.add("manoj");str.add("Charecter");str.add("TereLiye");str.add("Karan");str.add("Rahul");

		//this is the comment adding tio see how to avoid the git stash
		//Using Iterator
		Iterator h =str.iterator();
		
		System.out.println("using iterator");
		System.out.println("***********************************************");
		while(h.hasNext()) {
			
			System.out.println(h.next().toString());
			
		}
		
		//Using normal for
		System.out.println("using for loop"+str.size());
		System.out.println("***********************************************");
		for(int i=0;i<str.size();i++) {
			
			System.out.println(str.get(i));
			
		}
		
		//Using for each
		System.out.println("using for each Loop");
		System.out.println("***********************************************");
		
		for (String st : str) {
		
			System.out.println(st);
			
		}
		
		
		List<String> str2 = new  LinkedList<String>();
		
		str2.add("Sanjay");str2.add("Sanasjay");str2.add("Sanjdfgay");str2.add("Sansgsdfgjay");str2.add("sgf");str2.add("sgf");
		
		//using iterator 
		System.out.println("linked list using iterator");
		System.out.println("***********************************************");
		Iterator<String> it = str2.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		System.out.println("linked list using for each");
		System.out.println("***********************************************");
		
		for(String st: str2) {
			
			System.out.println(st);
			
		}
		
		System.out.println("linked list using for ");
		System.out.println("***********************************************");
		for(int i=0;i<str2.size();i++) {
			
			System.out.println(str2.get(i));
			
			}
		
		
		
		Map<String,Integer> hm = new HashMap<String,Integer>(); 
		
		hm.put("10thexam", 1);
		hm.put("radha", 1);
		hm.put("revathi", 1);
		hm.put( "sanjay",12);
	
		
		System.out.println("using For Entry set **********************************");
		
		for(Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("sanjay");
		hs.add("copy");
		hs.add("copycat");
		hs.add("covering this");
		hs.add("cater fillar");
		
		Iterator<String> h3 = hs.iterator();
		
		
		System.out.println("Set iteration **************************");
		while(h3.hasNext()) {
			
			System.out.println(h3.next());
			
			
			
		}
		
	}

}
