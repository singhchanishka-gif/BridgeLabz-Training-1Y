import java.util.Scanner;
class SumOfNaturalNumbersForLoop 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a natural number: ");
int n=sc.nextInt(),sum1=0;
if(n>0) 
{
for(int i=1;i<=n;i++) 
{
sum1+=i;
}
} 
else 
{
System.out.println("Please enter a valid natural number (greater than 0).");
}
int sum2=n*(n+1)/2;
System.out.println("Sum using for loop :" + sum1);
System.out.println("Sum using formula :" + sum2);
if(sum1==sum2)
{
System.out.println("Result is correct");
}
else 
{
System.out.println("Result is incorrect");
}
}
}
