import java.util.Scanner;
class SumOfNaturalNumbers
{
public static void main(String args[])
{
int num,i,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Sum From : ");
i= sc.nextInt();
System.out.println("Sum Upto : ");
num= sc.nextInt();
for(i=0;i<=num;i++)
{
sum=sum+i;
}
System.out.println("Sum of Natural NUmbers is : " + sum);
}
}