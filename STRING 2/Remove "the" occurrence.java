import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=a.replace("the","");
     String c=b.trim();
      System.out.println(c);
}
}
