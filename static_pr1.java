/*Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
methods and a main method*/
class Static_Class
{
     static String a="static_variable1";
     static String b="static variable2";
     public String name;
     private int Salary;
     public Static_Class(String name)
     {
        this.name=name;
     }
     public void Set_salary(int Stifend)
     {
         Salary=Stifend;
     }
     public void Emp_Details()
     {
         System.out.println("Name: "+name);
         System.out.println("Salary: "+Salary+"\n");
     }
     static int Method_1(int a,int c)
     {
         return a+c;
     }
     static int Method_2(int a)
     {

         return a;
     }

}

public class static_pr1 {
    public static void main(String[] args) {
        Static_Class obj=new Static_Class("Mudabir");
        obj.Set_salary(18000);
        obj.Emp_Details();
        // There is no need to create obj for static variables
        // You can call them by Calling class anme then putting dot and writing of hte variable 
        // Same goes with the methods
        System.out.println(Static_Class.a);
        System.out.println(Static_Class.b);
        System.out.println(Static_Class.Method_1(5, 6));   
        System.out.println(Static_Class.Method_2(56));     

    }
}
