import java.util.Scanner;
class SumOfNaturalNumbers 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a natural number :");
int n = sc.nextInt(),s=0;
if(n>0) 
{
int i=1;
while(i<=n) 
{
s+=i;
i++;
}
}
else
{
System.out.println("Please enter a valid natural number ");
}
int sum=n*(n+1)/2;
System.out.println("Sum using while loop :" +s);
System.out.println("Sum using formula : " + sum);
if(s==sum) 
{
System.out.println("Result is correct");
}
else 
{
System.out.println("Result is incorrect");
}
}
}