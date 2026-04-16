import java.util.Scanner;
class SumTillZeroOrNegative
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
double number,total = 0.0;
System.out.println("Enter a number :");
while (true) 
{       
number=sc.nextDouble();                                                                                                                                                                                                                                                                                                                                                                               
if (number <= 0)
{
break;
}
total+= number;
}
System.out.println("The total sum is: " + total);
}
}