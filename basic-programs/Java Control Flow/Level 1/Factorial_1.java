import java.util.Scanner;
class Factorial_1
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int num=sc.nextInt();
int factorial=1;
if(num>0) 
{
int i=1;
while(i<=num) 
{
factorial=factorial*i;
i++;
}
}
else 
{
System.out.println("Please enter a positive integer.");
}
System.out.println("Factorial of " + num + " is: " + factorial);
}
}