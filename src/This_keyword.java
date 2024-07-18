public class This_keyword {
    int i = 10;
    void  setValues(int i)
    {

       this.i=i; // if parameter has same variable and i is without this key word it will return zero
        // this key word is reference variable that refer instance variable value with in its class
    }
    void show()
    {
        System.out.println("The value of i ="+i);
    }

}
