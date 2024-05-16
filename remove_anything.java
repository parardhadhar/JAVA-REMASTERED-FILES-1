import java.util.*;
class remove_anything
{
 static void main()
 {
 Scanner sc=new Scanner(System.in);
 int i,d,n,s=0,c=0;
 System.out.println("Enter a number:");
 n=sc.nextInt();
 for(i=n;i>0;i/=10)
 {
 d=i%10;
 if(d%2==0)
 s=s+d*(int)Math.pow(10,c++);
 }
 System.out.println("New Number:"+s);
 }
}
