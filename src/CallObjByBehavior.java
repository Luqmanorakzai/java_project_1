public class CallObjByBehavior {
    public  static  void  main(String[] agr)
    {
        // obj called by behaviour
        CallObjByBehavior byBehavior = new CallObjByBehavior();
        byBehavior.eat();
        byBehavior.run();
    }
    public  void  eat(){
        System.out.println("I am eating");
    }

    public void  run(){
        System.out.println("you are walking");
    }
}
