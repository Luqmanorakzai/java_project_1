public class find_greater_no {
    public static void main(String[] agr) {
        int a = 100;
        int b = 30;
        int c = 50;
        // between 2
//        if(a > b)
//        {
//            System.out.println("a is greater");
//
//        }else {
//            System.out.println("b is greater");
//        }


//        //between 3
//        if (a>b && a> c)
//        {
//            System.out.println("a is greater");
//        } else if (b>a && b>c) {
//            System.out.println("b is greater");
//
//        }else {
//            System.out.println("c is greater");
//        }

        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("not greater");
            }
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }


    }
}
