import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      int a[]=new int[n];
 
      for(int i=0;i<n;i++)
      {
       a[i]=ob.nextInt();
      }
           int m=a[0];
        for(int i=0;i<n;i++)
        {
          if(m<a[i]){
            m=a[i];}
          }
       
      System.out.println(m+" is the maximum element in the array");
    }
}
