import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();
      int z=in.nextInt();
      if(x<y && x<z)
      {
   System.out.println("L1");
      }
      else if(y<x && y<z)
      {
    System.out.println("L2");
      }
    else
     System.out.println("L3");

    }
}
