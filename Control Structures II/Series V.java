import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=11,c=4;
      System.out.print(b*b+" ");
      for(int i=1;i<a;i++)
      {
        b=b+c;
        System.out.print(b*b+" ");
      }
}
}
