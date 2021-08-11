package com.Todd;

public class SearchEntries {

	public String[] findValue(String[][] inputArray, int elementNumbner, String valueToFind)

	{
		System.out.println(" the value is "+ valueToFind);
		ManageEntries myEntries = new ManageEntries();
		int arrayLength = inputArray.length;
		String[] newArray=new String[inputArray.length];
		
		boolean found=false;

		for (int x = 0; x < inputArray.length; x++) {// this nested 4 loop converts one of the rows of the input 2d array
			// into a string
			String outputString="";
			if (inputArray[x][elementNumbner].contains(valueToFind)) {	
				System.out.println("value found");
				found=true;
			for (int y = 0; y < inputArray[0].length; y++) {
				if (y == inputArray[0].length - 1) {
					outputString = outputString + inputArray[x][y];
					System.out.println(outputString);
				} else {
					outputString = outputString + inputArray[x][y] + ", ";

				}
			}

			newArray[x] = outputString;
			System.out.println(newArray[x] + " we found it at element " + x);
			//System.out.println("the entry is");
			
			
		
		}
		}
		if (found==false)
		{
			System.out.println("value not found");
		}
		
		return newArray;
	}
		
		public void findValue(String[][] inputArray, int elementNumber1,int elementNumber2, String valueToFind1, String valueToFind2)

		{
			
			boolean found=false;
			System.out.println(" the values are "+ valueToFind1+" and "+valueToFind2 );
			ManageEntries myEntries = new ManageEntries();
			int arrayLength = inputArray.length;
			String[] newArray=new String[inputArray.length];

			for (int x = 0; x < inputArray.length; x++) {// this nested 4 loop converts one of the rows of the input 2d array
				// into a string
				String outputString="";
				
				if ((inputArray[x][elementNumber1].contains(valueToFind1))&&(inputArray[x][elementNumber2].contains(valueToFind2))) {	
					System.out.println("value found");
					found=true;
					
				for (int y = 0; y < inputArray[0].length; y++) {
					if (y == inputArray[0].length - 1) {
						outputString = outputString + inputArray[x][y];
						System.out.println(outputString);
					} else {
						outputString = outputString + inputArray[x][y] + ", ";

					}
				}
				

				newArray[x] = outputString;
				System.out.println(newArray[x] + " we found it at element " + x);
				//System.out.println("the entry is");
			}
				
			}
			if (found==false)
			{
				System.out.println("value not found");
			}    
		/*
		 * for (int x=0;x<arrayLength;x++){ String inputValue; if
		 * (inputArray[x][elementNumbner]==valueToFind) { for (int
		 * y=0;y<inputArray[0].length;y++){
		 * 
		 * //myEntries.createEntry(valueToFind, inputArray); inputString= }
		 * 
		 * }
		 * 
		 * }
		 */
		//return newArray;
	}

}
