import java.util.*;
class arrd
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [5],d,c,s,n,i=0;
        System.out.println("Enter 5 nos");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<5;i++)
        {
            n=a[i];s=0;c=0;
            while(n!=0)
            {
                d=n%10;
                if(d!=0)
                {
                    s=s+(int)Math.pow(10,c++)*d;
                }
                n=n/10;
                
            }
           a[i]=s; 
        }
        
        System.out.println("The new array is");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}