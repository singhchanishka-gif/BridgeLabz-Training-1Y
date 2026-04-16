import java.util.Scanner;
class celsius_to_fahrenheit
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
      double c,f;
	  System.out.println("Enter temperature in celsius :");
	  c=sc.nextInt();
	  f=(c*9/5)+32;
	  System.out.println("Temperature in fahrenheit :"+f);
	  }
	  }
	  