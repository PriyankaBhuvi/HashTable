package com.vstl.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestJavaHashtableExample {

	public static void main(String[] args) {
		
		JavaHashtableExample objJavaHashtableExample = new JavaHashtableExample();
          Hashtable<String,String>objHashtable =objJavaHashtableExample.getHashtableInfo();
		
		System.out.println("get CollegeName  : "+objHashtable.get("CollegeName"));
		System.out.println("***********************");
		
		JavaHashMapExample objJavaHashMapExample = new JavaHashMapExample();
		
		HashMap<Integer,String> objHashMap= objJavaHashMapExample.getHashMap();
		System.out.println(objHashMap.containsKey(300));
		
		System.out.println(objHashMap.containsValue("Sonu"));//true
		
		System.out.println(objHashMap.containsValue("Sara"));//false
		
		System.out.println(objHashMap.isEmpty());//hasmap cotain data ,so here //false
		
		System.out.println(objHashMap.keySet());//return all the keys as set
		
		System.out.println(objHashMap.values());//return all the values as collection

		System.out.println(objHashMap.entrySet());//return all the entries as the set
		
		
	}


}
