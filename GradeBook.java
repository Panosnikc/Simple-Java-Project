package demo;



public class GradeBook {

	// Declare class variables/attributes as private
	private String courseName; 
	private int [] grades; 
	
	// Constructor
	public GradeBook (String cname ,int [] gradesArray)
	{
		this.courseName = cname;
		this.grades = gradesArray;
	}
	// Setter method
	public void setCourseName(String cname) {
		this.courseName = cname;
	}
	
	// Getter method
	public String getCourseName() {
		return courseName;
	}

	// function that returns the Minimum grade
	public int getMinimum() {
		int lowGrade = grades[0];
		for(int grade : grades )
			if ( grade < lowGrade)
				lowGrade = grade;
		
		return lowGrade;
	}
	
	// method getMaximum() grade
	public int getMaximum() {
		int  maxGrade = grades[0];
		for (int grade : grades)
			if (grade > maxGrade)
				maxGrade = grade;
		
		return maxGrade;
	}
	
	// getAverage() grade method
	public double getAverage() {
		int total = 0;
		for( int grade : grades)
			total += grade; 
		
		return (double) total / grades.length; 
	}
	
	// processGrades() method, that prints the data in the console
	public void processGrades() {
		// Print Average, Max and Minimum data on the console 
		System.out.println("\n-------------------------------");
		System.out.printf("\nThe Average, max and min grade for the %s course. ", getCourseName());
		System.out.printf("\nAverage grade of 10 students, for this course is: %.2f", getAverage());
		System.out.printf("\nMax grade is: %d \nMinimun grade is: %d ", getMaximum(), getMinimum());
	}
	
}
