import java.util.Scanner;
class LeapYear1
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = sc.nextInt();
if (year>=1582) 
{
if(year%4==0) 
{
if(year%100==0) 
{
if(year%400==0) 
{
System.out.println(year+" is a Leap Year");
} 
else 
{
System.out.println(year+" is not a Leap Year");
}
}
else 
{
System.out.println(year+" is a Leap Year");
}
} 
else 
{
System.out.println(year+" is not a Leap Year");
}
}
else 
{
System.out.println("Please enter year 1582 or greater than 1582");
}
}
}
