import java.util.Scanner;
class Calculator 
{
public static void main(String[]args) 
{
Scanner sc = new Scanner(System.in);
double n1,n2;
String op;
System.out.print("Enter first number: ");
n1=sc.nextDouble();
System.out.print("Enter second number: ");
n2=sc.nextDouble();
System.out.print("Enter operator (+, -, *, /): ");
op=sc.next();
double result;
switch(op) 
{
case "+":
result=n1+n2;
System.out.println("Result: "+result);
break;
case "-":
result=n1-n2;
System.out.println("Result: "+result);
break;
case "*":
result=n1*n2;
System.out.println("Result: "+result);
break;
case "/":
if(n2!=0) 
{
result=n1/n2;
System.out.println("Result: "+result);
} 
else 
{
System.out.println("Cannot divide by zero.");
}
break;
default:
System.out.println("Invalid Operator.");
}
}
}