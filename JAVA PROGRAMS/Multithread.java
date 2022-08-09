class A implements Runnable
{
public void run()
{
int i;
for (i=1; i<=10; i++)
{
System.out.println("Thread A = " +i);
}
}
}
class B implements Runnable
{
 public void run()
{
int i;
for (i=1; i<=10; i++)
{
System.out.println("Thread B = " +i);
}
}
}
class Multithread
{
public static void main(String args[])
{
A r = new A();
B r1 = new B();
Thread t1=new Thread (r);
Thread t2=new Thread (r1);
t1.start();
t2.start();
}
}