import java.util.Scanner;
class smallest_number
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter three numbers :");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if(n1<n2&&n1<n3)
System.out.println("First number is the smallest number");
else
System.out.println("First number is not the smallest number");
}
}