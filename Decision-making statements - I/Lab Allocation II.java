import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner ka =new Scanner(System.in);
      int x=ka.nextInt();
      int y=ka.nextInt();
      int z=ka.nextInt();
      String k=ka.next();
      switch(k)
      {
        case "L1":
          if(y<z)
          {
            System.out.println("L2");
          }
          else
          {
             System.out.println("L3");
          }
          break;
          case "L2":
          if(x<z)
          {
            System.out.println("L1");
          }
          else
          {
             System.out.println("L3");
          }
          break;
          case "L3":
          if(x<y)
          {
            System.out.println("L1");
          }
          else
          {
             System.out.println("L2");
          }
          break;
         
         
    }
}
}
