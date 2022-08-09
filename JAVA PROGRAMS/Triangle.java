import java.util.Scanner;
import java.lang.Math.*;
class Triangle
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter The 1st Side");
int a= obj.nextInt();
System.out.println("Enter The 2nd Side");
int b= obj.nextInt();
System.out.println("Enter The 3rd Side");
int c= obj.nextInt();
float s=(a=b=c)/2;
double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of a Triangle is :" +area);
}
}