import java.util.Scanner;
public class even_odd {
    public static void main(String[] agr)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your number");
        int num = scanner.nextInt();
        if (num%2==0)
        {
            System.out.println("Enven num");

        }else {
            System.out.println("Odd num");
        }
    }

}
