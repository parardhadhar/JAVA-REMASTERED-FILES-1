import java.util.*;
class remove_zero
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,m,s,c,d;
        System.out.println("Enter a no");
        n=ob.nextInt();//2025
        m=n;s=0;c=0;
        while(n!=0)
        {
            d=n%10;//5
            if(d!=0)
            {
                s=s+(int)Math.pow(10,c++)*d;//
                
            }
            n=n/10;
        }
        System.out.println("The new no is"+s);
    }
}