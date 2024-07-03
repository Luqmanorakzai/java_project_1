public class ObjByMethod {
    public  static  void  main(String[] agr)
    {
        // obj called by method
        ObjByMethod byMethod = new ObjByMethod();
        byMethod.details("Luqman", 24);
        byMethod.show();
    }
    String name;
    int age ;
    public  void  details(String n, int a)
    {
        name = n;
        age = a;
    }

    public  void show()
    {
        System.out.println("Mu name is "+name);
        System.out.println("I am years old "+age);
    }
}
