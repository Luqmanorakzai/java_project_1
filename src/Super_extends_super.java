import java.security.spec.RSAOtherPrimeInfo;

public class Super_extends_super extends Super_keyword{
    int a = 20;
    void  test(int a){
        System.out.println("print value from the parameter directly "+a);
        System.out.println("Refers intance variable within the class "+this.a);
        System.out.println("refers the parent class object "+super.a);

    }
    public static void main(String[]agr)
    {
        Super_extends_super super_extends_super = new Super_extends_super();
        super_extends_super.test(30);
    }
}
