import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner aa=new Scanner(System.in);
      int m=aa.nextInt();
      int a[][]=new int[m][m];
      int result[]=new int[m];
       int result1[]=new int[m];
      int dsum=0;
        int d1sum=0;
      int z=0;
     
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<m;j++)
         {
         a[i][j]=aa.nextInt();
         }
      }
     
       int max=0;
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<m;j++)
         {
          max=max+a[i][j];
           }
          result[i] = max;
          max=0;
      }
      int max1=0;
      for(int j=0;j<m;j++)
      {
         for(int i=0;i<m;i++)
        {
          max1=max1+a[i][j];
           }
          result1[j] = max1;
          max1=0;
      }
      for(int i=0;i<m;i++)
      {
      dsum+=a[i][i];
      d1sum+=a[i][m-1-i];
      }
     
      for(int i=0;i<result.length;i++)
      {
     
      if(result[i]==result1[i])
      {
     
        z=result[0];
       }
       else
       {
       
       z=result1[0];
       }
     
      }
     
      if((z==dsum)&&(z==d1sum))
         {
         System.out.println("yes");
         }
         else
         {
         
         System.out.println("no");
         }
         }
}
