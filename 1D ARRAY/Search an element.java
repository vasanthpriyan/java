import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
        Scanner vasanth=new Scanner(System.in);
      int n=vasanth.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
         a[i]=vasanth.nextInt();
         }
      int b=vasanth.nextInt();
      for(int i=0;i<n;i++){
      if(a[i]==b){
      System.out.printf("%d is present in the array",b);
        break;
      }
        else{
          System.out.printf("%d is not present in the array",b);
        break;
        }
      }
    }
}
