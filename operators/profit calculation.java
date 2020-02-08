import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int a,b,c,d;
     a=s.nextInt();
     b=s.nextInt();
    c=s.nextInt();
    d=(a*b)-(a*c)-100;
      System.out.println("The profit obtained is Rs."+d);
    }
}
