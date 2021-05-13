import javax.swing.plaf.synth.SynthLookAndFeel;

class Class1
{
    
    public static void Method1()
    {
        System.out.println("Static_Method is used");
    }
    public void Method2()
    {
        System.out.println("Instance_Method is used");
    }


}
public class array_pr7 {
    public static void main(String[] args)
    {
        //static method
        Class1.Method1();
        Class1 ob=new Class1();
        //instance Method
        ob.Method2();
    }
}
