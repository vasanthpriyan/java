 import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
      String b=sc.nextLine();
      int count=0;
     
      for(int i=0;i<=b.length()-1;i++)
      {
       
      if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'||b.charAt(i)=='A'||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U')
      {
        count++;
      }
      }
      System.out.println(count);
    }
  }
