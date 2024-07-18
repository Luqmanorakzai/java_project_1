public class star2 {
    public static void main(String []agr)
    {
        for (int i = 1; i<=10; i++)
        {
            for (int j = 10; j>=i; j--)
            {
                //to create space before star
                System.out.print(" ");
            }
            // to print stars
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            //to take into new line
            System.out.println();

        }

    }
}
