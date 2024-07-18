import java.util.Scanner;
public class calculator_using_do_while {
    public static void main(String[] agr) {

        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no1");
            int no1 = sc.nextInt();
            System.out.println("enter no2");
            int no2 = sc.nextInt();
            System.out.println("select (+,-.*,/)");
            String sym = sc.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("addition is " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("subtraction is " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("multplication is " + res);
                    break;
                case "/":
                    if (no2 == 0) {

                        System.out.println("zero cannot divide by anu number");
                    } else {
                        res = no1 / no2;
                        System.out.println("division " + res);
                    }
                default:
                    break;
            }
            System.out.println("Press y for continue and n for terminate");
            yn = sc.next();
        } while (yn.equals("y")||yn.equals("Y"));

    }
}
