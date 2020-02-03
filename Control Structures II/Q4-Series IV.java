import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner vasanth=new Scanner(System.in);
      int n=vasanth.nextInt();
      Float a=0.5f;
     System.out.print(a+" ");
      for(int i=1;i<n;i++){
      Float b=a;
       a=a+a;
        a=a+b;
        System.out.print(a+" ");
      }
	}
}
