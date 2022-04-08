package Files;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class LAB8 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter file = new FileWriter("expenses.txt",true);
		String answer;
		
		do {
			System.out.print("Input your name: ");
			String name = scan.next();
			
			System.out.print("What did you purchase? ");
			String purchase = scan.next();
			
			System.out.print("How much did you pay? (in USD) ");
			double amount = scan.nextDouble();
			
			String str = name + " purchased " + purchase + " for " + amount + " US Dollars.";
			
			file.write(str + "\n");
			
			System.out.print("Would you like to log another purchase? (y/n) ");
			answer = scan.next();
			
		}
		
		while (answer.equalsIgnoreCase("y"));
		
		file.close();
		
		System.out.print("Would you like to read a summary of your purchases? ");
		String s = scan.next();
		
		File file2 = new File("expenses.txt");
		Scanner scanFromFile = new Scanner(file2);	
		
		if (s.equalsIgnoreCase("y")) {
			while(scanFromFile.hasNext()) {
				String summary = scanFromFile.nextLine();
				System.out.println(summary);
				
			}
			
		}
		
	}
		
}
