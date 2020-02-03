import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c[][]=new int[20][20];
        int i,j,sum=0;
       for(i=0;i<a;i++)
       {
         for(j=0;j<b;j++)
         {
           c[i][j]=ob.nextInt();
         }
       }
     
       for(i=0;i<a;i++)
       {
         for(j=0;j<b;j++)
         {
          if(c[j][i]>sum)
          {
            sum=c[j][i];
          }
         }
         System.out.println(sum);
         sum=0;
       }
}
}
