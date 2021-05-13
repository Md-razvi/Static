public class static_pr3 {
    static int number=36;

    public int InstanceMethod()
    {
        System.out.println(static_pr3.number);
        return 0;
    }
    public static void main(String[] args) {
        static_pr3 Obj=new static_pr3();
        Obj.InstanceMethod();
        
    }
}
