public class ParameterizeConstructor {
    public  static  void  main(String[] agr)
    {
        // parameterize constructor
        ParameterizeConstructor parametConstructor = new ParameterizeConstructor("Luqman",24);
        System.out.println(parametConstructor);
    }
    public ParameterizeConstructor(String name, int age)
    {
        System.out.println("my name is "+name);
        System.out.println("I am "+age+" years old");
    }


}
