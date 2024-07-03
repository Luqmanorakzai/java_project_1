public class SwapWithout {
    public  static  void  main(String[] agr)
    {
        int a = 20;
        int b = 30;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
