package com.Todd;

import java.util.Scanner;

public class BuildAString {

	private String personString;

	public String getPersonString() {
		
		return personString;
		
	}

	public void setPersonString() {
		
		Scanner scanner=new Scanner(System.in);
		String inputString;
	
		
		 System.out.println("please enter your first name");
		 personString=scanner.nextLine()+ ", ";
		 System.out.println("please enter your last name");
		personString=personString+scanner.nextLine()+", ";
		 System.out.println("please entern your adress");
		 personString=personString+scanner.nextLine()+", ";
		 System.out.println("please enter city");
		 personString=personString+scanner.nextLine()+", ";
		 System.out.println("please enter your state");
		 personString=personString+scanner.nextLine()+", ";
		 System.out.println("please enter your zip code");
		 personString=personString+scanner.nextLine()+", ";
		 System.out.println("please enter your telephone number");
		 personString=personString+scanner.nextLine()+", ";
		 
		 this.personString=personString;
		
	}
	
	
	
	
}
