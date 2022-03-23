class Special_Pattern
{
public static void main(String args[])
{
int n=5;
for (int i=1;i<=n;i++)
{
for (int j=1;j<=n+1;j++)
{
if (j<=i)
{
System.out.print((i)+" ");
}
else
{
System.out.print((char)(i+64)+" ");
}
}
System.out.println();
}
}
}