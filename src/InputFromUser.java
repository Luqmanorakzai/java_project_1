import java.util.Scanner;
public class InputFromUser {

    public  static  void  main(String[] agr)
    {

        Scanner scanner = new Scanner(System.in);
        //method to take input from user
        System.out.println("Enter your name ");
        String  name = scanner.next();
        System.out.println("your name is "+name);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("Enter your Grad");
        char grade = scanner.next().charAt(0);
        System.out.println("your grad is "+grade);
        System.out.println("Enter yur phNo");
        long phNum = scanner.nextLong();
        System.out.println("ph No :"+phNum);

    }

}
