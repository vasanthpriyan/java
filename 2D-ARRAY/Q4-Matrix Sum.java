import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
       int b=ob.nextInt();
      int c[][]=new int[20][20];int sum=0;
      for(int i=0;i<a;i++)
      {
       for(int j=0;j<b;j++)
       {
        c[i][j]=ob.nextInt();
       }
      }for(int i=0;i<a;i++)
      {
       for(int j=0;j<b;j++)
       {
        sum=sum+c[i][j];
       }
      }
      System.out.println(sum);
}
}
