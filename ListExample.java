package com.vstl.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
	
	public void getNumberList() {
		
		List<Integer>objList = new ArrayList<Integer>();
		objList.add(100);
		objList.add(200);
		objList.add(300);
		objList.add(400);
		objList.add(500);
		objList.add(600);
		objList.add(700);
		objList.add(800);
		
		System.out.println("List Data : "+objList.get(0));
		System.out.println("List Data : "+objList.size());
	}
	//Set:
public void getNumberSet() {
		
		Set<Integer>objSet = new HashSet<Integer>();
		objSet.add(100);
		objSet.add(200);
		objSet.add(300);
		objSet.add(400);
		objSet.add(500);
		objSet.add(600);
		objSet.add(700);
		objSet.add(800);
		
		System.out.println("Set  Data : "+objSet.toString());
		System.out.println("Set  Data : "+objSet.isEmpty());
		
}	
	//try-catch
public List<String> getStudentName() {
	   try {
           List<String>objList = new ArrayList<String>();
           objList.add("Ronu");
           objList.add("Priya");
           objList.add("Laxmi");
           objList.add("Pavu");
           objList.add("Karni");
           objList.add("Divya");
           objList.add("Sonu");
           objList.add("Sara");

    System.out.println("List Data : "+objList.get(0));
  return objList;
	   }catch(Exception exception) {
		   System.out.println("I got the exception : "+exception.getMessage());
		   exception.printStackTrace();
		   return null;
	   }
	   
   }
   
}
  
   
   