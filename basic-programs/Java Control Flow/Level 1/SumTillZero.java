import java.util.Scanner;
class SumTillZero 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
double number,total=0.0;
System.out.print("Enter a number : ");
number = sc.nextDouble();
while (number != 0) 
{
total+=number;
number = sc.nextDouble();
}
System.out.println("The total sum is: " + total);
}
}