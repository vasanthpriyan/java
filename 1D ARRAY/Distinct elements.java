import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int count=0,sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+a[i];
      if(a[i]!=sum)
         {
           count++;
         }
         }
    System.out.println(count);
   
  }
}
