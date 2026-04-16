import java.util.Scanner;
class simple_interest
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter principal,rate and time :");
int t;
double SI,p,r;
p=sc.nextDouble();
r=sc.nextDouble();
t=sc.nextInt();
   SI=(p*r*t)/100;  
  System.out.println("Simple Interest :"+SI);
  }
  }