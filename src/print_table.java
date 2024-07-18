import java.util.Scanner;

public class print_table {
    public static void main(String[] agr) {
        String y;
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter a number to print a table");
           int no = sc.nextInt();
           for (int i = 1; i <= 10; i++)
               System.out.println(no + " x " + i + " = " + no * i);
           System.out.println("press y to continue");
           y = sc.next();
       }while (y.equals("Y") || y.equals("y"));
    }
}
