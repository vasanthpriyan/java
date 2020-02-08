import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int principal_amount=s.nextInt();
      int number_of_years=s.nextInt();
      float rate_of_interest=s.nextFloat();
      float SI=((principal_amount*number_of_years*rate_of_interest)/100);
      System.out.println(SI);
    }
}
