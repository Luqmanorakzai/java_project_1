public class NoAgrWithReturnType {
    public static void main(String[] agr){
       NoAgrWithReturnType returnType = new NoAgrWithReturnType();
        System.out.println(returnType.sumAll());
    }
    public int sumAll()
    {
        int a =50 ,b= 30 ,c= 60;
        int sum = a+b+c;
        return sum;
    }
}
