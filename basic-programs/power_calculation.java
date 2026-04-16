import java.util.Scanner;
class power_calculation
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double base,exponent,result;
System.out.println("Enter base and exponent :");
base =sc.nextDouble();
exponent=sc.nextDouble();
result=Math.pow(base,exponent);
System.out.println("Result ="+result);
}
}