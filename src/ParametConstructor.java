public class ParametConstructor {
    public  static  void  main(String[] agr)
    {
        // parameterize constructor
        ParametConstructor parametConstructor = new ParametConstructor("Luqman",24);
        System.out.println(parametConstructor);
    }
    public ParametConstructor(String name, int age)
    {
        System.out.println("my name is "+name);
        System.out.println("I am "+age+" years old");
    }


}
