import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      if(b<a)
  {
    a=100-a;
    int c=a+b;
System.out.println(c);
  }
  else
  {
 System.out.println(b-a);
  }
    }
}
