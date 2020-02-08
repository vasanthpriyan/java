import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int x1=s.nextInt();
    int y1=s.nextInt();
    int x2=s.nextInt();
    int y2=s.nextInt();
   float a=(x1+x2)/2f;
    float b=(y1+y2)/2f;
    System.out.println("Binoy's house is located at ("+a+","+b+")");
  }
}
