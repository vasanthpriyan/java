import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       
       Scanner ob=new Scanner(System.in);
      char a=ob.next().charAt(0);
      if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
      {
        System.out.println("Vowel");
      }
      else if(a >= 'a' && a <= 'z')
      {
        System.out.println("Consonant");
      }
      else
         {
        System.out.println("Not an alphabet");
      }
    }
}

