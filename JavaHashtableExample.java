package com.vstl.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class JavaHashtableExample {
	
	public Hashtable<String ,String> getHashtableInfo() {
		try {
			Hashtable<String,String> objHastable =new Hashtable<String ,String>();
			objHastable.put("CollegeName", "ShivanandCollege");
			objHastable.put("BankName","USBank");
			objHastable.put("HospitalName","kimsHospital");
			
			System.out.println("Data : "+objHastable.toString());
			return objHastable;
			
		}catch(Exception exception) {
			 
			System.out.println("got exception :"+exception.getMessage());
			
			exception.getMessage();
			
			return null;
		}
	}		
	 
}  
			
			
			
			
			
	
			
		
		
	


