package pack;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

    // Get marks for the two subjects
    System.out.print("Enter marks for Subject 1: ");
    int subject1Marks = scanner.nextInt();

    System.out.print("Enter marks for Subject 2: ");
    int subject2Marks = scanner.nextInt();

    // Define the passing marks
    int passingMarks = 35;

    // Check if the candidate has passed
    if (subject1Marks >= passingMarks && subject2Marks >= passingMarks) {
        System.out.println("Candidate has passed.");
    } else {
        System.out.println("Candidate has failed.");
    }

    scanner.close();

		// TODO Auto-generated method stub

	}

}
