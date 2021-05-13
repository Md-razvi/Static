// Call static methods in instance methods
public class static_pr5 {
    public void InstMeth()
    {
        //Static Method
        static_pr5.StatMethod();

    }
    public static void StatMethod()
    {
        System.out.println("My staticMethod");
    }
    public static void main(String[] args) 
    {
        static_pr5 obj=new static_pr5();
        obj.InstMeth();
    }
}
