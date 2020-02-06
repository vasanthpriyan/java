import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=a;
       String c="";
      for(int i=a.length()-1;i>=0;i--)
      {
        c=c+a.charAt(i);
       
      }
      System.out.println(c);
     
}
}
