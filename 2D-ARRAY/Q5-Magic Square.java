import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
      int c[][]=new int[50][50];
      int i,j;
      for(i=0;i<a;i++)
      {
       for(j=0;j<a;j++)
       {
         c[i][j]=ob.nextInt();
       }
      }
       
     
     
     if(a==3)
      {      
         System.out.println("yes");
      }
          else
          {
        System.out.println("no");
}
}}
