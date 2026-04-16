import java.util.Scanner;
class perimeter
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
double l,b,p;
System.out.println("Enter length and breadth :");
l=sc.nextDouble();
b=sc.nextDouble();
p=2*(l+b);
System.out.println("Perimeter of rectangle is :"+p);
}
}