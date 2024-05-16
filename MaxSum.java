import java.util.Scanner;
public class MaxSum
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
double d[] = new double[20];
double i,max,s=0;
System.out.println("Enter the digits");
for(i=0;i<20;i++)
{
    d[i]=in.nextDouble();
}
max=d[0];
for(i=0;i<20;i++)
{
    s=s+d[i];
    if(d[i]>max)
    {
        max=d[i];
    }
}
System.out.println("The sum is="+s);
System.out.println("The max value is="+max);
}
}
