public class Main {
    public static void main(String[] args) {


        // left shifting operator
        System.out.println("Hello Java");
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
        System.out.println(-10 << 4);//-10*2^4=-10*16

        System.out.println("...................");

        //right shifting operator
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2

        System.out.println(".................");

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a == c);//true || true = true // not check the second
        System.out.println(a > b | a < c);//true | true = true   // check both side
        //  || vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked

        // java ter
        int d = 10;
        int f = 20;
        int g = 5;
        int min = (d < f) ? d : f;
        System.out.println(min);


    }// main method
}