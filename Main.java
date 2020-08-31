package demo;


import java.util.Scanner;


public class GradeBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner, is it's necessary in java to input data using keyboard
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1 to call the method throught object myGradeBook.processGrades(); with static data. "
				+ "\nEnter 2 to call the method/function proccedssGrades() from main, with static data. "
				+ "\nEnter 3 to Enter dynamically the data to myGradeBook. ");
		
		System.out.printf("Enter a number: ");
		int choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("Grades for 10 students are: ");
			int [] gradesArray = { 6, 7, 5, 9, 2, 4, 10, 9, 6, 8 };
			GradeBook myGradeBook = new GradeBook("Java", gradesArray);
	  
			for (int gradesArrays : gradesArray) {
				System.out.printf(" ");
				System.out.print(gradesArrays + ",");
			}
			// Calling the public method processGrades() from the GradeBook Class
			myGradeBook.processGrades();
			break;
		case 2:
			System.out.println();
			// Call the function processGradess()
			processGradess();
			break;
		case 3:
			 System.out.println();
			 processGradessDynamic();
			 break;
		default:
			System.out.println("Not a valid choice!\nPlease try again...\n");			
		}

		
	} // End main
	
	public static void processGradess() {
		// Declare and initialize an array, with length = 10 numbers
		int [] array = { 6, 7, 5, 3, 8, 4, 10, 9, 7, 8 };
		// Create a myGradeBook object type GradeBook, So we can have access to the GradeBook Class
		GradeBook myGradeBook = new GradeBook("java", array);
		
		// Print all the necessary data to the console
		System.out.println("\n-------------------------------");
		System.out.printf("\nCalculate the Average, Max and Min grade for the %s course: ", myGradeBook.getCourseName());
		System.out.printf("\nThe Average grade of the class is: %.2f", myGradeBook.getAverage());
		System.out.printf("\nThe Maximun courseName grade is: %d "
				+ "\nThe Minimum courseName grade is: %d", myGradeBook.getMaximum(), myGradeBook.getMinimum());
	} // end function processGrades()
	
	// function processGradessDynamic();
	// To process the data given from the user
	public static void processGradessDynamic() {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the course name: ");
		String courseName = input.nextLine();
		
		System.out.printf("Enter the number of students: ");
		int studentNumber = input.nextInt();
		
		int [] gradesArray = new int [studentNumber];
		
		for(int counter = 0; counter < gradesArray.length; counter++ ) {
			System.out.printf("Enter the %d student grade for the %s course: ", counter + 1, courseName);
			gradesArray [counter] = input.nextInt();
		}
		System.out.println("-------------------------------");
		System.out.printf("The grades for %d students, for %s course are: ", studentNumber, courseName);

		// For-each loop to print the numbers we have input
		for (int i : gradesArray) 
		    System.out.print(i + ",");
		
		// Create a myGradeBook object type GradeBook
		GradeBook myGradeBook = new GradeBook(courseName, gradesArray);
		
		// Print data  
		System.out.println("\n-------------------------------");
		System.out.printf("\nCalculate the Average, Max and Min grade for the %s course: ", myGradeBook.getCourseName());
		System.out.printf("\nThe Average grade of the class is: %.2f", myGradeBook.getAverage());
		System.out.printf("\nThe Maximun course grade is: %d "
				+ "\nThe Minimum course grade is: %d", myGradeBook.getMaximum(), myGradeBook.getMinimum());
	} 

} 

