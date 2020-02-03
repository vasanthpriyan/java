import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner aa=new Scanner(System.in);
      int m=aa.nextInt();
      int n=aa.nextInt();
      int a[][]=new int[m][n];
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
         {
         a[i][j]=aa.nextInt();
         }
      }
      int max=a[0][0];
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
         {
       if(a[i][j]>max)
           {
             max=a[i][j];
           }
         }
      }
      System.out.println(max);
     
      }
   
    }
