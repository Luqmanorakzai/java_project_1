public class Family {
    public  static  void  main(String[] agr)
    {
        // by reference variable to initialize the obj
        Family Fname = new Family();
        Fname.name = "Luqman Hakem";
        System.out.println(Fname.name);
        Fname.age = 26;
        System.out.println(Fname.name+" and "+"you are "+" "+Fname.age);
    }
    String name;
    int age;

}
