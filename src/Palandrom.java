public class Palandrom {
    public static void main(String[]agr)
    {
//        String name = "LuqmaN";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

        String name = "madam";// madam
        String rev = "";
        String num = "1221";

        for (int i = num.length()-1;i>=0;i--)
        {
//            rev= rev+name.charAt(i);
            rev= rev+num.charAt(i);
        }
//        System.out.println(rev);
        if (num.equals(rev))
        {
            System.out.println("panandrom");

        }else {
            System.out.println("not palandrom");
        }



    }

}
