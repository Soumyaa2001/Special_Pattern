import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter The Length");
int l= obj.nextInt();
System.out.println("Enter The Width");
int w= obj.nextInt();
int A=(l*w);
System.out.println("Area of a Rectangle is :" +A);
}
}