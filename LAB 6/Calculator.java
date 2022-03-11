package Lab6;
import java.util.Scanner;

public class Calculator {
	 private int num1;
	    private int num2;
	    private String operator;

	    public Calculator() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        num1 = Integer.parseInt(scan.nextLine());

	        System.out.print("Input the operator (+,-,x,/): ");
	        operator = scan.nextLine();

	        System.out.print("Input the second number: ");
	        num2= Integer.parseInt(scan.nextLine());

	        switch (operator){
	            case "+":
	                System.out.println(add(num1,num2));
	                break;
	           
	            case "-":
	                System.out.println(subtract(num1,num2));
	                break;
	           
	            case "x":
	                System.out.println(multiply(num1,num2));
	                break;
	            
	            case "/":
	                System.out.println(divide(num1,num2));
	                break;
	            
	            default:
	                break;
	        }
	    }

	    public String add(int a, int b) {
	        int sum = a + b;
	        return a + " + " + b + " = " + sum;
	    }

	    public String subtract(int a, int b) {
	        int diff = a - b;
	        return a + " - " + b + " = "+ diff;
	    }

	    public String multiply(int a, int b) {
	        int prod = a*b;
	        return a + " + " + b + " = " + prod;
	    }

	    public String divide(int a, int b) {
	        int quot = a/b;
	        return a + "/" + b + " = " + quot;
	    }
  
	

}
