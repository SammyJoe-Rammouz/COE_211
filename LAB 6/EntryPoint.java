import java.util.Scanner;

public class EntryPoint {
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        String again;
        do {
            System.out.println("Which service would you like to use? \n" +
                    "[1]: Basic week visualiser\n" +
                    "[2]: Advanced week visualizer\n" +
                    "[3]:Basic calculator\n" +
                    "[4]Employee repertoire");
            int i = Integer.parseInt(scan.nextLine());
            switch (i) {
                case 1:
                    BasicWeek basicWeek = new BasicWeek();
                    basicWeek.PrintDays();
                    break;
                case 2:
                    AdvancedWeek advancedWeek = new AdvancedWeek();
                    advancedWeek.PrintAdvanced();
                    break;
                case 3:
                    Calculator calc = new Calculator();
                    break;
                case 4:
                    Employee employee = new Employee();
                    System.out.println(employee);
                    break;
                default:
                    System.out.println("Please make sure you pick a number between 1 and 4");
                    break;

            }
            System.out.println("Would you like to perform another operation? (y/n)");
            again=scan.nextLine();
        }
        while (again.equals("y"));
    }
}


