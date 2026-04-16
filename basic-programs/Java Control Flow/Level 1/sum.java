import java.util.Scanner;
class sum
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int n=sc.nextInt(),sum=0;
if(n>0)
{
sum=n*(n+1)/2;
System.out.println("The sum of "+n+" natural numbers is "+sum);
}
else
{
System.out.println("The number is "+n+" not a natural number");
}
}
}