import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner vasanth=new Scanner(System.in);
      int a=vasanth.nextInt();
      int b=3,c=1;
      
      for (int i=0;i<a;i++){
        c=b*c;
        System.out.print(c+" ");
	}
}}
