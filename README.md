## Features of Java 7 ##
1.	String literals in switch statement..e.g,
		```
		switch(fruit){
			case "Mango": System.out.println("Fruit is mango");
				break;
		}```
		
2. 	Diamond operator in collection..e.g,
		```ArrayList<String> al = new ArrayList<>();```
	Earlier we had to provide type on both the sides. From Java 7, type on right is not necessary.
	
3.	Single catch block to catch multiple exceptions..e.g,
		```try {
			//code that throws exception
		} catch (NullPointerException | ArrayIndexOutOfBoundException e) {
			//exception handling
		}```
		
4. 	try-with-resource block..i.e, resources opened at the start of the try block are closed automatically when the try block ends, no need to do so manually in finally block. This feature is termed as ```Automatic Resource Management (ARM)```

## Features of Java 8 ##

#### JAVA LANGUAGE ####
1.	Default and static methods in interfaces.
2.	Repeating annotations.
3.	Functional interfaces.
4.	Lambda expressions

#### JAVA COMPILER ####
1.	Named parameters

#### JAVA LIBRARIES ####
1.	Optional class
2.	Date/Time API
3.	Stream API
