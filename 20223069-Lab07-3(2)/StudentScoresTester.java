import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				/** Your code goes here */
				studSc.add(name, score);
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		/** And here */
		Student highest_student = studSc.getHighest();
		Student lowest_student = studSc.getLowest();
		System.out.println("The highest Student is " + highest_student.name() + " and score is " + Integer.toString(highest_student.score()));
		System.out.println("The lowest Student is " + lowest_student.name() + " and score is " + Integer.toString(lowest_student.score()));
	}
}
