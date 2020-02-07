import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
 Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();
      int z=in.nextInt();
      int n=in.nextInt();
      int a=x-n;
    int b=y-n;
    int c=z-n;
    if(a<0&&b<0&&c<0)
    System.out.println(0);
    else if(a<b&&a<c)
    System.out.println(1);
    else if(b<a&&b<c)
    System.out.println(3);
     else
    System.out.println(3);
    }
}
