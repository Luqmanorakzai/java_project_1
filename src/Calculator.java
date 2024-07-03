import java.util.Scanner;

public class Calculator {
    public static void main(String[] agr) {
        Calculator calculator = new Calculator();
        System.out.println("Choose an option: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        Scanner scanner = new Scanner(System.in);
        double option = scanner.nextDouble();
//        if (option == 1) {
//            calculator.add();
//        } else if (option == 2) {
//            calculator.subtract();
//        } else if (option == 3) {
//            calculator.multiply();
//        } else if (option == 4) {
//            calculator.divide();
//        } else if (option >= 5) {
//            System.out.println("Wrong Opton");
//        } else {
//            System.out.println("terminated");
//        }

        switch ((int) option)
        {
            case 1 :
                calculator.add();
                break;
            case 2:
                calculator.subtract();
                break;
            case 3:
                calculator.multiply();
                break;
            case 4:
                calculator.divide();
                break;
            case 5:
                System.out.println("worng opton");
                break;
            default:
                System.out.println("terminated");
                break;
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();
        double result = num1 + num2;
        System.out.println("Numbers added " + result);
    }

    public void subtract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();
        double result = num1 - num2;
        System.out.println("Numbers subtracted " + result);
    }

    public void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();
        double result = num1 * num2;
        System.out.println("Numbers multiplied " + result);
    }

    public void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Error");
        } else {
            double result = num1 / num2;
            System.out.println("Numbers divided " + result);
        }
    }


}
