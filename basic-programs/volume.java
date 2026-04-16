import java.util.*;
class volume 
{
public static void main()
{
Scanner sc=new Scanner(System.in);
double r,h,v;
System.out.println("Enter radius and height : ");
r=sc.nextDouble();
h=sc.nextDouble();
v=Math.PI*r*r*h;
System.out.println("Volume of Cylinder :"+v);
}
}