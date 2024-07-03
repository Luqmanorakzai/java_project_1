public class Family_2 {
    public  static  void  main(String[] agr)
    {
        // by methods to initialize the `obj
        Family_2 Fname2 = new Family_2();
        Fname2.hisNmae("luqman", 26);
        Fname2.disp();
    }
    String name;
    int age;

    void  hisNmae(String n, int a)
    {
        name = n;
        age = a;
    }
    void  disp()
    {
        System.out.println(name+" "+ age);
    }

}
