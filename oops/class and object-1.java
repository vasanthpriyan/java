import java.util.*;
class Registration
{
   static void display(String s1,String s2,String s3,String s4,String s5,String s6 )
  {
     System.out.println("Customer Details");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
     System.out.println("Thank you for registering. Your id is 1...");
     
  }
  
    
  }
   
  
 class Main
{
  public static void main(String args[])
  {
    Registration a=new Registration();
    Scanner aa=new Scanner(System.in);
    String s1,s2,s4,s5;
    String s3,s6;
    System.out.println("Registration");
  System.out.println("Enter your name");
    s1=aa.next(); 
  System.out.println("Enter your address");
    s2=aa.next(); 
  System.out.println("Contact Number");
    s3=aa.next(); 
   System.out.println("E-Mail ID");
    s4=aa.next(); 
   System.out.println("Enter proof type");
    s5=aa.next(); 
   System.out.println("Enter proof id");
    s6=aa.next();
    a.display(s1,s2,s3,s4,s5,s6);
  }
}
