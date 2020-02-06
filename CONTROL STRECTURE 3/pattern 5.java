import java.util.Scanner;
class Main
{public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
int i,j,n,k=1;
       n = in.nextInt();
      for(i=1;i<=n;i++)
    {
for(j=1;j<=i;j++)
  System.out.print(k+++" ");
  System.out.println(" ");
  }  
}
}
