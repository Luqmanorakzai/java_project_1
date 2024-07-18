public class Test3 {
    public  static  void  main(String[] agr)
    {
        // parameterized constructor
        Test3 t3 = new Test3("name");
    }
    //  parameterized constructor
    Test3(String name){
        System.out.println("Name : Luqman");
        int age = 26;
        int pho = 123;
        System.out.println("age:"+age);
        System.out.println("Phone No:"+pho);
    }
}
