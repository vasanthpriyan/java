import java.util.Scanner;
class Main
{
	 public static void main(String args[])
{
Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int c=0;
          for( int i=1;i<=a;i++)
          {
            for(int j=1;j<=i;j++)
            {
              ++c;
            if(c%2==0)
            {
              System.out.print(1+" ");
            }
            else
            {
              System.out.print(0+" ");
            }
            }
            System.out.println();
            }
          }
          }
