//Call instance methods in static methods
public class static_pr4 {
    public int Method()
    {
        System.out.println("Integer_Method");
        return 0;
    }
    static int Method1()
    {
        static_pr4 obj=new static_pr4();//instance is created as obj
        //calling instance method in static method
        obj.Method(); 
        //System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        Method1();
    }
}
