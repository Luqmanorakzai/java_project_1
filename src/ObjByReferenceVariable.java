public class ObjByReferenceVariable {
    String fname;
    String lname;
    int age;
    public  static  void  main(String[] agr)
    {
        // by Reference variable
        ObjByReferenceVariable byReferenceVariable = new ObjByReferenceVariable();
        byReferenceVariable.fname = "Luqman";
        byReferenceVariable.lname = "Hakeem";
        byReferenceVariable.age = 24;
        System.out.println(byReferenceVariable.fname+" "+byReferenceVariable.lname);
        System.out.println("you are years old! "+byReferenceVariable.age);
    }

}
