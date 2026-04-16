import java.util.Scanner;
class Factors2
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int number=sc.nextInt();
if (number>0) 
{
int i=1;
while (i<number)
System.out.println("Factors of " + number + " are:"); 
{
if(number%i==0) 
{
System.out.println(i);
}
i++;
}
System.out.println("Please enter a positive integer.");
}
else
{
System.out.println("Please enter a positive integer.");
}
}
}