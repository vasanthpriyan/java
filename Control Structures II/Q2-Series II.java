import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner vasanth=new Scanner(System.in);
      int a=vasanth.nextInt();
      int b=6;
      System.out.print(b+" ");
      for (int i=1;i<a;i++){
      int c=i*5;
       b=b+c;
        System.out.print(b+" ");
      }
	}
}
