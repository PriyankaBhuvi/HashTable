package com.vstl.exceptionHandling;

public class ExceptionHandling {
	
	public void SumCalculation(int intDivisibleValue) {
		try {
		 int intTotalValuue=65; int intResult = 0;
		  System.out.println("Sum Calculation");
		 intResult=intTotalValuue/intDivisibleValue;
		 System.out.println("Divisible value : "+intResult);
		if(intResult>0) {
			 System.out.println("I got output");
		}
		
	}catch(ArithmeticException arithmeticException) {
		
		System.out.println("I got exception : "+arithmeticException.getMessage());
		arithmeticException.printStackTrace();
}
	}

	//Array Exception out Of Bound :
	  public void getArrayDate() {
	  try {
		  int intArray[] = {100,200,300,400,500,600,700,800};
		   System.out.println("Array Int Data : "+intArray[8]);
		  
	} catch (ArrayIndexOutOfBoundsException arryArrayIndexOutOfBoundsException) {
  
		System.out.println("Exception : "+arryArrayIndexOutOfBoundsException.getMessage());
		arryArrayIndexOutOfBoundsException.printStackTrace();
    }
	  }

  //NullPointer Exception :
  public void getStudentInfo() {
	  try {
	  String strName =null;
	  System.out.println("Student Name : "+strName.length());
	  
  }catch (NullPointerException nulPointerException) {
	  System.out.println("Exception : "+nulPointerException.getMessage());
	  nulPointerException.printStackTrace();
      }
  }
  
  //NumberFormate Exception :
    public void getNumber () {
    	try {
    		String strNumber="AdharCardNumber";
    		int intCoverted =Integer.parseInt("AdharCardNumber");
    	}catch (NumberFormatException numberFormatException) {
    		System.out.println("Exception : "+numberFormatException.getMessage());
    		numberFormatException.printStackTrace();
    	}
    }

	//String IndexOutOf Bound :
     public void getRiverName() {
    	 try {
    		 String strRiverName="Krishna River";
    		 System.out.println("River name is : "+strRiverName);
    	 }catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
    		 System.out.println("Exception : "+stringIndexOutOfBoundsException);
    		 stringIndexOutOfBoundsException.printStackTrace();
    	 }
    	 }
     }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
 