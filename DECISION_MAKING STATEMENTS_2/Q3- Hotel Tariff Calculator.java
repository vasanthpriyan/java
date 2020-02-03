 import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int month, n;
float rent, t = 0, r = 0;
month = STDIN_SCANNER.nextInt();
rent = STDIN_SCANNER.nextFloat();
n = STDIN_SCANNER.nextInt();
t = rent * n;
r = (float)((rent + rent * 0.2) * n);

switch(month) {
case 1:
p(t);
break;
case 2:
p(t);
break;
case 3:
p(t);
break;
case 4:
p(r);
break;
case 5:
p(r);
break;
case 6:
p(r);
break;
case 7:
p(t);
break;
case 8:
p(t);
break;
case 9:
p(t);
break;
case 10:
p(t);
break;
case 11:
p(r);
break;
case 12:
p(r);
break;


default:
System.out.print("Invalid Input");
break;
}
}

public static void p(float t) {
System.out.printf("%.2f", t);
}

public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
