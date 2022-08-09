class Star_Pattern_3
{
public static void main(String args[])
{
int i,j,k,row=5;
for(i=0;i<row;i++)
{
for(j=row-i;j>1;j--)
{
System.out.print(" ");
}
for(k=1;k<=(i*2)-1;k++)
{
System.out.print("*");
}
System.out.println();
}
} 
}