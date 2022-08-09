class ReverseNumber
{
public static void main (String args[])
{
int inputNumber=4567;
System.out.println("Input Number :" + inputNumber);
int OutputReversedNumber=0;
while (inputNumber !=0)
{
int lastDigit = inputNumber % 10;
OutputReversedNumber = OutputReversedNumber * 10 + lastDigit;
inputNumber = inputNumber /10;
}
System.out.println("Reversed Number :" + OutputReversedNumber);
}
}