public class Animal {
    public  static  void  main(String[] agr)
    {
// the object tony is created from Animal Class through constructor
        Animal tony = new Animal();
        tony.run();
//      Animal tony = new Animal();  // can not create same object of the class
        tony.eat();
        // should be creat separate object  of the separate class
        Birds sp = new Birds();
        sp.fly();
    }

//    public  static  void  mai(String[] agr)
//    {
//
//    }
    public void run()
    {
        System.out.println("tony is running");
    }
    public void eat()
    {
        System.out.println("tony is  eating");
    }

}
