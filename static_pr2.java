// Print instance variables in static methods
public class static_pr2 {
    public String name="Instance_Variable";
    static void Method1()
    {
        // instance variable cannot be called  without the help of keyword new
        // Once object varaible is created you can call any instance variable  
        static_pr2 obj=new static_pr2();
        System.out.println(obj.name);
    }
    public static void main(String[] args) {
        static_pr2.Method1();
    }
}
