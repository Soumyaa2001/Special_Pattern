import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int i,n,fact=1;
System.out.println("Enter The Number : ");
Scanner obj = new Scanner(System.in);
n = obj.nextInt();
for(i=1;i<=n;i++)
{
fact = fact*i;
}
System.out.println("Factorial of The Number is : " + fact);
}
}