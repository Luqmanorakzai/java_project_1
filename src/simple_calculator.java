import java.util.Scanner;
public class simple_calculator {
    public static void  main(String []agr)
//    {
////        int no1 = 20;
////        int no2 = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no1");
//        int no1 = sc.nextInt();
//        System.out.println("enter no2");
//        int no2 = sc.nextInt();
//        System.out.println("select (+,-.*,/)");
//        String sym=sc.next();
//        int res;
//        switch (sym){
//            case "+":res= no1+no2;
//                System.out.println("addition is "+res);
//                break;
//            case "-":res= no1-no2;
//                System.out.println("subtraction is "+res);
//                break;
//            case "*":res=no1*no2;
//                System.out.println("multplication is "+res);
//                break;
//            case "/":if (no2 ==0){
//
//                System.out.println("zero cannot divide by anu number");
//            }else {
//                res = no1/no2;
//                System.out.println("division "+res);
//            }
//            default:
//                break;
//        }
//    }

    // using if
    {
//        int a = 20;
//        int b = 0;
          double res;
        Scanner cal = new Scanner(System.in);
        System.out.println("Enter first no");
        double a = cal.nextDouble();
        System.out.println("Enter second no");
        double b = cal.nextDouble();
        System.out.println("select options(1 for add, 2 for sub,3 for mul,4 for div)");
        double opt = cal.nextDouble();
        if (opt == 1 )
        {
            res = a+b;
            System.out.println("addition "+res);
        }else if (opt == 2)
        {
            res = a-b;
            System.out.println("subrarction "+res);
        } else if (opt == 3) {
            res = a*b;
            System.out.println("multiplication "+res);
        } else if (opt == 4) {
            if (b==0){
                System.out.println("wrong number");
            }else {
                res = a/b;
                System.out.println("diviion "+res);
            }
        }else {
            System.out.println("enter correct");
        }

    }

}
