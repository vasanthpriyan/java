import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      float x=sc.nextFloat();
      float y=sc.nextFloat();
      if(x==(y*12))
        System.out.print("No profit nor loss");
       else if(x>(y*12))
         System.out.printf("Loss : Rs.%.2f",x-(y*12));
       else
     System.out.printf("Profit : Rs.%.2f",x-(y*12)); 
    }
}
