import java.util.Scanner;
class average
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double a,b,c,avg;
System.out.println("Enter three numbers :");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
avg=(a+b+c)/3;
System.out.println("Average of three numbers is :"+avg);
}
}