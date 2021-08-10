package com.Todd;

import java.util.Scanner;
import java.util.Arrays;

public class PhoneMain {

	public static void main(String[] args) {
		
	String [][]phoneBook1= new String[0][7];
	String phoneBook[][];
	
	Scanner scanner= new Scanner(System.in);
	String selections="0";
	while(selections!="12")
	{
	System.out.println("please pay attention to the menue options");
	System.out.println("enter 1 to create a new entry");
	System.out.println("enter 2 to search for an exiting entry by first name");
	System.out.println("enter 3 to search for an exiting entry by last name");
	System.out.println("enter 4 to search for an exiting entry by full name");
	System.out.println("enter 5 to search for an exiting entry by city");
	System.out.println("enter 6 to search for an exiting entry by state");
	System.out.println("enter 7 to search for an exiting entry by Address");
	System.out.println("enter 8 to search for an exiting entry by Telephone");
	System.out.println("enter 9 to delete a record by telephone number");
	System.out.println("enter 10 to update a record by telephone number");
	System.out.println("enter 11 to show all the records by ascending order");
	System.out.println("enter 12 to exit the application");
	
		selections = scanner.nextLine();
		 
		 
		 switch (selections)
		 {
		 
		 case ("1"):
		 {
			 ManageEntries myPhoneBook=new ManageEntries();
			 System.out.println("type \"y\" if you want to drag and drop an entry "
			 		+ "and any other letter to enter the information manually ");
			 String manually="y";
			 manually=scanner.nextLine();
			 System.out.println(manually);
			 String entry;
			 if (manually.equals("y")){
				 System.out.println("please drag and drop your information into the console");
				 System.out.println("use this patter:\"first name, last name, address, city, state, zipcode, phone number");
				 entry=scanner.nextLine();
				 String []splitArray = entry.split(", ");
				 int splitLength=splitArray.length;
				 while (splitLength!=7)
				 {
					 System.out.println("the information you entered is incomplete or"
					 		+ " in the wrong format, please use this patter:\"first name, last name, address, city, "
					 		+ "state, zipcode, phone number");
					 entry=scanner.nextLine();
					 String []split2= entry.split(", ");
					 splitLength=split2.length;
				 }
				
			 }
			 else {
				 BuildAString myString= new BuildAString();
				 myString.setPersonString();
				 entry=myString.getPersonString();
				 System.out.println(entry+"entry");
				 
			 }
			 if (phoneBook1.length!=0)
			 {
			 
			 phoneBook1=myPhoneBook.createEntry(entry,phoneBook1);
			 }
			 else 
			 {
				phoneBook1= myPhoneBook.createEntry(entry);
				 
			 }
			 
			 
			String [] testArray= myPhoneBook.convertTo1D(phoneBook1);
			for(int x=0;x<testArray.length;x++)
			{
				System.out.println("the value at:"+x+" is "+testArray[x]);
				
			}
			 
			 break;
		 }
		 case ("2"):
		 {
			String firstName;//String[][] inputArray, int elementNumbner, String valueToFind
			System.out.println("Searching by first name.");
			System.out.println("Please type the first name your are looking for and press enter");
			firstName=scanner.nextLine();
			SearchEntries newSearch= new SearchEntries();
			newSearch.findValue(phoneBook1, 0, firstName);
			
			break;
		 }
		 	
		 case ("3"):
		 {
			 String lastName;//String[][] inputArray, int elementNumbner, String valueToFind
				System.out.println("Searching by last name.");
				System.out.println("Please type the last name your are looking for and press enter");
				lastName=scanner.nextLine();
				SearchEntries newSearch= new SearchEntries();
				newSearch.findValue(phoneBook1, 1, lastName);
				
				break;
			
		 }
		 case ("4"):
		 {
			 String lastName;
			 String firstName;//String[][] inputArray, int elementNumber1,int elementNumber2, String valueToFind1, String valueToFind2
				System.out.println("Searching by frist and last name.");
				System.out.println("Please type the first name your are looking for and press enter");
				firstName=scanner.nextLine();
				System.out.println("Please type the last name your are looking for and press enter");
				lastName=scanner.nextLine();
				SearchEntries newSearch= new SearchEntries();
				newSearch.findValue(phoneBook1, 0,1, firstName, lastName);
			 
			break; 
		 }
		 case ("5"):
		 {String city;//String[][] inputArray, int elementNumbner, String valueToFind
			System.out.println("Searching by city.");
			System.out.println("Please type the city your are looking for and press enter");
			city=scanner.nextLine();
			SearchEntries newSearch= new SearchEntries();
			newSearch.findValue(phoneBook1, 3, city);
			
			
			
			break; 
		 }
		 
		 case ("6"):
		 {
			 String state;//String[][] inputArray, int elementNumbner, String valueToFind
				System.out.println("Searching by state.");
				System.out.println("Please type the state your are looking for and press enter");
				state=scanner.nextLine();
				SearchEntries newSearch= new SearchEntries();
				newSearch.findValue(phoneBook1, 4, state);
				
				
			break; 
		 }
		 case ("7"):
		 {
			 String address;//String[][] inputArray, int elementNumbner, String valueToFind
				System.out.println("Searching by address.");
				System.out.println("Please type the address your are looking for and press enter");
				address=scanner.nextLine();
				SearchEntries newSearch= new SearchEntries();
				newSearch.findValue(phoneBook1, 5, address);
				
				
			break; 
		 }
		 
		 case ("8"):
		 {
			 String phoneNumber;//String[][] inputArray, int elementNumbner, String valueToFind
				System.out.println("Searching by Telephone number");
				System.out.println("Please type the phoneNumber your are looking for and press enter");
				phoneNumber=scanner.nextLine();
				SearchEntries newSearch= new SearchEntries();
				newSearch.findValue(phoneBook1, 5, phoneNumber);
			
			break; 
		 }
		 
		 case ("9"):
		 {
			System.out.println("Please enter the phone number of the entry you want to delete");
			String phoneNumber=scanner.nextLine();
			ManageEntries manage= new ManageEntries();
			
			phoneBook1=manage.deleteEntry(phoneBook1, 6, phoneNumber);
			
			
			
			break; 
		 }
		 
		 case ("10"):
		 {
			
			 
			 ManageEntries manage=new ManageEntries();
			phoneBook1=manage.updateArray(phoneBook1, 6);
					
			break; 
		 }
		 
		 case ("11"):
		 {
			
			 
				 ManageEntries entries = new ManageEntries();
				 
				 
				 String oneDArray[]=new String[phoneBook1.length];
				 
				 oneDArray=entries.convertTo1D(phoneBook1);
				 /*for (int x =0;x<oneDArray.length;x++)
				 { System.out.println("this is the string at element "+x+": "+oneDArray[x]);
				 }*/
				 
				 Arrays.sort(oneDArray);
				 
				 
				 for (int x =0;x<oneDArray.length;x++)
				 { System.out.println("this is the sorted string at element "+x+": "+oneDArray[x]);
				 }
				 
				 phoneBook=entries.convertTo2D(oneDArray, 7);
				 for (int x=0;x<phoneBook.length;x++)
				 
				 {
				 
					 phoneBook1=phoneBook;	 
					 
				/* for (int y=0;y<phoneBook1[0].length;y++)
				 {
					 //System.out.println(" the sorted value is "+phoneBook1[x][y]+" at x value of "+x+" and ya value of "+y);
					 
				 }*/
				 
				 
			 }
			 
			break; 
		 }
		 case ("12"):
		 {
			 
		 System.out.println("exiting system");
		 
		 System.exit(0);
		 }
		 default:
		 {
			 System.out.println("you have entered an invalid menue options, please try again");
		 }
		 }
		 
		// System.out.println(inputString);

	}}}


