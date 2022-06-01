package com.vstl.collection;

import java.util.List;

public class TestListExample {

	public static void main(String[] args) {

		ListExample objListExample= new ListExample();
		objListExample.getNumberList();
		
		List<String>numberList = objListExample.getStudentName();
		System.out.println("Index 4 number : "+numberList.get(4));
		
		
		
	}

}
