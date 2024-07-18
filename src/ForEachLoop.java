import java.lang.reflect.Array;

public class ForEachLoop {
    public static void main(String[]args)
    {
        String[] names= {"apple", "banana", "pine", "peach"};
        for(String fNames:names)// fName is new variable assigned and : use instead of in
        {
            System.out.println(fNames);

        }
    }
}
