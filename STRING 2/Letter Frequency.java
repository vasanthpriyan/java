import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     int a;
        String b;
        char c, ch;
        Scanner scan = new Scanner(System.in);
          b=scan.nextLine();
          int i=b.length();
        for(c='a'; c<='z'; c++)
        {
            a=0;
            for(int j=0; j<i; j++)
            {
                ch = b.charAt(j);
                if(ch == c)
                {
                    a++;
               
                }
            }
            if(a>0)
            {
                System.out.println(c+""+a);
            }
        }
   }
}
