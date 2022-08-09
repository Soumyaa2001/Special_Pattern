import java.util.Scanner;
class Grade
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Marks Obtained in Physics :");
int phy = sc.nextInt();
System.out.println("Enter Marks Obtained in Chemistry :");
int chem = sc.nextInt();
System.out.println("Enter Marks Obtained in Maths :");
int maths = sc.nextInt();
int total = phy+chem+maths;
float avg = total/3;
System.out.println("Total Marks Obtained is = " +total);
System.out.println("Total Percentage = " +avg +"%");
if (avg>=60)
{
System.out.println("FIRST DIVITION");
}
else if (avg>=45)
{
System.out.println("SECOND DIVITION");
}
else if (avg>=30)
{
System.out.println("THIRD DIVITION");
}
else
{
System.out.println("FAILED!!");
}
}
}
