import java.util.Scanner;
class largest_number
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers :");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println("First number is the largest");
}
else if(a<b&&b>c)
{
System.out.println("Second number is the largest");
}
else
{
System.out.println("Third number is the largest");
}
}
}