import java.util.Scanner;

public class find_grad {
    public static void main(String[] agr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int obtainMarks = sc.nextInt();
        if (obtainMarks >= 950 ) {
            System.out.println("Grade A1");
        } else if (obtainMarks >= 800 ) {
            System.out.println("Grade A");
        } else if (obtainMarks >= 700) {
            System.out.println("Grade B");
        } else if (obtainMarks >= 500 ) {
            System.out.println("Grade C");
        } else if (obtainMarks >= 250 ) {
            System.out.println("Grade D");
        } else if (obtainMarks <=200) {
            System.out.println("you are failed");
        } else {
            System.out.println("enter correct marks");
        }

    }

}
