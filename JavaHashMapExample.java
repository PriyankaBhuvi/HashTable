package com.vstl.collection;

import java.util.HashMap;

public class JavaHashMapExample {
	
	//HashMap m= new HashMap();
	public HashMap<Integer, String> getHashMap() {
		
	
	 HashMap <Integer ,String> objHashMap	 =new HashMap<Integer,String>();

	  objHashMap.put(100,"Ronu");
	  objHashMap.put(200,"Sonu");
	  objHashMap.put(300,"Priya");
	  objHashMap.put(400,"praveen");
	  objHashMap.put(500,"Asha");
	  objHashMap.put(600,"Sona");
	  
	  System.out.println(objHashMap);
	  System.out.println(objHashMap.get(200));
	  objHashMap.remove(100);//remove pair from Hashmap
	  System.out.println(objHashMap);

	System.out.println(objHashMap.containsKey(300));//true
	System.out.println(objHashMap.containsKey(100));//false
	
	System.out.println(objHashMap.containsValue("Sonu"));//true
	System.out.println(objHashMap.containsValue("Sara"));//false
	
	System.out.println(objHashMap.isEmpty());//hasmap cotain data ,so here //false
	
	System.out.println(objHashMap.keySet());//return all the keys as set
	
	System.out.println(objHashMap.values());//return all the values as collection

	System.out.println(objHashMap.entrySet());//return all the entries as the set
	return objHashMap;
	
	
	}

}
