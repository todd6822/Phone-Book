package com.Todd;

import java.util.Scanner;

public class ManageEntries {

	public String[][] createEntry(String fullString, String[][] array)// this takes in your array and adds a new 2d row
																		// to it
																		// it separates each entry by the ", "
																		// characters
	{
		int inputArrayXSize = array.length;// we need the length of both dimensions of the input array
		int inputArrayYSize = array[0].length;// here is the length of the second input array
		String[] splitArray = new String[inputArrayYSize];// this line creates a new array based on the 1st dimension
															// size of the input array
		splitArray = fullString.split(", ");// this line splits the input string into the respective elements on the
											// input string when it sees the character ", "

		String[][] returnArray = new String[inputArrayXSize + 1][inputArrayYSize];// we create a new string array with
																					// room for one more column (1st
																					// dimension entry)

		for (int x = 0; x < array.length; x++) {// this nested for loop copies the input array into the new array
			for (int y = 0; y < array[0].length; y++) {
				returnArray[x][y] = array[x][y];
			}
		}
		for (int z = 0; z < inputArrayYSize; z++) {// this section adds a new line to the END of the array
			returnArray[inputArrayXSize][z] = splitArray[z];
		}

		for (int x = 0; x < returnArray.length; x++) {
			for (int y = 0; y < returnArray[0].length; y++) {// this prints out the array
				//System.out.println(returnArray[x][y] + "at x value: " + x + " at y value " + y);
			}

		}
		
		//System.out.println("array x size= "+returnArray.length+ "array y size= "+returnArray[0].length);

		return returnArray;
	}

	public String[] convertTo1D(String[][] array)

	{
		System.out.println("Starting to convert to a string");

		int inputArraySize = array.length;// gets the size of the input array
		String myString[] = new String[inputArraySize];// this creates a new 1 d array based on the size of the input
														// array

		for (int x = 0; x < inputArraySize; x++) {// this nested 4 loop converts one of the rows of the input 2d array
													// into a string
			String outputString="";

			for (int y = 0; y < array[0].length; y++) {
				if (y == array[0].length - 1) {
					outputString = outputString + array[x][y];// we take the string at x,y and add it to the end of the
																// string we're creating
				//	System.out.println(outputString);// we add the character ", " to the end of each addition unless
														// it's the last one
				} else {
					outputString = outputString + array[x][y] + ", ";

				}
			}
			myString[x] = outputString;
		//	System.out.println(myString[x] + " this is element " + x);
		}

		return myString;
	}
	
	public String [][] convertTo2D(String []inputArray,int d2Size)
	{
		String splitArray[][]=new String[inputArray.length][d2Size];
		//splitArray = fullString.split(", ");
			for (int x=0;x<inputArray.length;x++)
			{
			for (int i=0;i<inputArray.length;i++){
				splitArray[x]=inputArray[x].split(", ");
			}
			}

		return splitArray;
	}

	public String[][] createEntry(String fullString)//overLoaded firstEntry method that just takes a string
	
	{
		

		String[] splitArray = fullString.split(", ");

		int splitArrayLength=splitArray.length;
		String[][] returnArray = new String[1][splitArray.length];

		for (int z = 0; z < splitArrayLength; z++) {
			returnArray[0][z] = splitArray[z];
		}
		//System.out.println("first entry processing");
		for (int x = 0; x < returnArray.length; x++) {
			for (int y = 0; y < returnArray[0].length; y++) {
				//System.out.println(returnArray[x][y] + "at x value: " + x + " at y value " + y);
			}

		}

		return returnArray;
	}
	public String[][] swap(String[][] inputArray, int elementNumber1,int elementNumber2)

	{
		
		String swapValue;
		

		for (int x = 0; x < inputArray.length; x++) {// this nested 4 loop converts one of the rows of the input 2d array
			
			swapValue=inputArray[x][elementNumber1];
			inputArray[x][elementNumber1]=inputArray[x][elementNumber2];
			inputArray[x][elementNumber2]=swapValue;
			
		}
		
	
	return inputArray;
}
	
	public String[][] updateArray(String [][] inputArray, int elementNumber)
	
	{
		
		int elementToModify=-1;
		String selection="0";
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is the phone number of the entry you would like to change");
		String phoneNumber=scanner.nextLine();
		
		
		for(int x=0;x<inputArray.length;x++){
			if (inputArray[x][elementNumber].contains(phoneNumber)){	
				elementToModify=x;
				}
			else{
				continue;
			}
			}
		
		if (elementToModify==-1){
			System.out.println("No entry found");
			scanner.close();
			return inputArray;
			}
		System.out.println("whats value would you like to update");
		System.out.println("please type a selection and press enter");
		System.out.println("1 for first name, 2 for last name, 3 for Address, 4 for telephone number");
		selection=scanner.nextLine();
		switch(selection){
		case "1":{
		System.out.println("please enter the new first name");
		inputArray[elementToModify][0]=scanner.nextLine();
			break;
		}
		case "2":{
		System.out.println("please enter the new last name");
		inputArray[elementToModify][1]=scanner.nextLine();
			break;
		}
		case "3":{
			System.out.println("please enter the new address");
			inputArray[elementToModify][2]=scanner.nextLine();
			System.out.println("please enter the new city");
			inputArray[elementToModify][3]=scanner.nextLine();
			System.out.println("please enter the new state");
			inputArray[elementToModify][4]=scanner.nextLine();
			System.out.println("please enter the new zipcode");
			inputArray[elementToModify][5]=scanner.nextLine();
			break;
		}
		case "4":{
			System.out.println("please enter the new Phone Number");
			inputArray[elementToModify][6]=scanner.nextLine();
			
		}
		default:
		{
			System.out.println("invalid option");
			
		}
		}
		
		
		
		
		//scanner.close();
		return inputArray;
	}
	
	public String[][] deleteEntry(String [][] inputArray, int d2Elements, String phoneNumber)
	
	{
		String [][] returnArray=new String [inputArray.length-1][7];
		int y=0;
		boolean found=false;
		
		System.out.println("input array length is "+inputArray.length);
		
		for (int x=0;x<inputArray.length;x++)
			if(inputArray[x][d2Elements].contains(phoneNumber))
			{	System.out.println("delete mnethod x is "+x+ " y is "+y+" at line 206");
				found=true;
				
				continue;
			}
			else
			{	System.out.println("delete mnethod x is "+x+ " y is "+y+" at line 210");
				returnArray[y]=inputArray[x];
				y++;
				
			}
		
			if (found==true)
			{
				System.out.println("entry was found and deleted");
			}
			else 
			{
				System.out.println("phone number was not found");
			}
			
		return returnArray;
		
		
	/*	for (int x=0;x<returnArray.length;x++){
			if (inputArray[x][d2Elements].contains(phoneNumber)){
				if(x==inputArray.length-1){
					System.out.println("removed at the end");
					x=inputArray.length;
				}
				else{
					System.out.println("removed at "+ x);
					x++;
				continue;
				}
			}
			else{
				
				if ((x==inputArray.length)&&(!inputArray[x][d2Elements].contains(phoneNumber))){
					System.out.println("value not found");
						}else
				{returnArray[x]=inputArray[x];
					}
				
			}
			
		}
			
		
		
		return returnArray;*/
		
	}
	
}
