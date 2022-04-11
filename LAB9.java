package Revision;
import java.util.Scanner;

public class LAB9 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int nbOfAssignemtns, sum = 0;
		int[] array = new int[5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("Input the grade of assignment " + (i+1));
			int nbOfAssignments = scan.nextInt();
			array[i] = nbOfAssignments;
		}
		
		System.out.println("Input the number of attended labs");
		int attendances = scan.nextInt();
		
		System.out.println("Input the midterm grade");
		int midtermGrade = scan.nextInt();
		
		for (int i = 0; i<5; i++) {
			sum += array[i];
		}
		
		double overallAssignments = ((double)sum/5) * 0.3;
		double overallAttendance = ((double)attendances/7) * 100 * 0.05;
		double overallMidterm = midtermGrade * 0.3;
		
		System.out.println("Assignment (30%): " + (int)overallAssignments);
		System.out.println("Attendance (5%): " + (int)overallAttendance);
		System.out.println("Midterm (30%): " + (int)overallMidterm);
		
	}

}
