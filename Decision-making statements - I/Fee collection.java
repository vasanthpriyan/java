import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
    String type=sc.nextLine();
    float tf=sc.nextInt();
   float bf=sc.nextInt();
   float hf=sc.nextInt();
    if(type.equals("MSH"))
    System.out.printf("%.2f",tf+hf);
    else if(type.equals("MSDS"))
    System.out.printf("%.2f",tf+bf);
    else if(type.equals("MGSDS"))
    System.out.printf("%.2f",bf+((150*tf)/100));
   
                       else if(type.equals("MGSH"))
                        System.out.printf("%.2f",hf+((150*tf)/100));
                        else
                         System.out.print("Invalid");
    }
}
