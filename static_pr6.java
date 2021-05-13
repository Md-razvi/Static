//Print all the static, instance variables in main method
public class static_pr6 {
  private static int number=10;
  int number2=12;
  public static void main(String[] args) {
      // Since number  belongs to same class then it can be directly called
     // static variable
      System.out.println(number);
      static_pr6 ob=new static_pr6();
      //Instance variable
      System.out.println(ob.number2);
}
}
