import java.util.Scanner;
class distance_conversion
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double d1,d2;
System.out.println("Enter distance in kilometers :");
d1=sc.nextDouble();
d2=d1*0.621371;
System.out.println("Distance in miles is :"+d2);
}
}
