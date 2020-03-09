package Lab.Saturday;

/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java  
-- arithmetic operations with int and double operands (i.e. variables)
-- mixed addition
-- integer division. double division. mixed division */

public class Numbers {

	
	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		iResult = iNumOne + (int) dNumOne;
		dResult = dNumTwo + iNumTwo;
		
		String intRes = "int result";
		String dRes = "double result";
		
		//addition task
		iResult = (int)dNumOne / iNumOne;
		dResult = dNumTwo * iNumOne;
		System.out.println(intRes + "" + iResult);
		System.out.println(dRes + dResult);
		
		//multiplication task
		iResult = iNumOne * (int)dNumOne;
		dResult = dNumTwo * iNumOne;
		System.out.println(intRes + "" + iResult);
		System.out.println(dRes + dResult);
		
		//division task
		iResult = (int)dNumOne / iNumOne;
		dResult = dNumTwo / iNumOne;
		System.out.println(intRes + "" + iResult);
		System.out.println(dRes + dResult);
		
		//subtraction task
		iResult = (int)dNumOne - iNumOne;
		dResult = (double)(dNumOne - iNumOne);
		System.out.println(intRes + "" + iResult);
		System.out.println(dRes + dResult);
	}

}
