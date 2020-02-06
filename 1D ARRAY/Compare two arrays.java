import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      int a[]=new int[10];
      int b[]=new int[10];
    boolean flag=false;
      for(int i=0;i<n;i++)
      {
        a[i]=ob.nextInt();
      }
       for(int i=0;i<n;i++)
      {
         b[i]=ob.nextInt();
      }
     for(int i=0;i<n;i++)
      {
         if(a[i]==b[i])
         {
           flag=true;
         }
      }
    if(flag)
    {
      System.out.println("Yes");      
    }
    else
    {
      System.out.println("No");
    }
  }
}
