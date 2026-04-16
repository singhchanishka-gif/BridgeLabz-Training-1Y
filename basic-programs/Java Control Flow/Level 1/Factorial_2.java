import java.util.Scanner;
class Factorial_2 
{
public static void main(String[]args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Natural Number: ");
int num = sc.nextInt();
int factorial = 1;
if(num>0) 
{
for(int i=1;i<=num;i++) 
{
factorial=factorial*i;
}
} 
else 
{
System.out.println("Not a Natural Number ");
}
System.out.println("Factorial of " + num + " is: " + factorial);
}
}