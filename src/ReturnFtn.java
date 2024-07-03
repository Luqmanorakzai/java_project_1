public class ReturnFtn {
    public static void main(String[] agr)
    {
       ReturnFtn ftn = new ReturnFtn();
       //access the method by object ftn
        System.out.println(ftn.intType(20,30));
    }
    public int intType(int a, int b)
    {
        return a*b;
    }
}
