import java.util.*;
class interchange
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [5];
        int m,n,s,c,i,first,last,d;
        System.out.println("Enter 5 elements in an array");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<5;i++)
        {
            m=n=a[i];
            s=0;
            c=0;
            first=0;
            last=a[i]%10;
            while(n!=0)
            {
                first=n%10;
                n=n/10;
            }
            while(m!=0)
            {
                d=m%10;
                if(d==first)
                s=s+(int)Math.pow(10,c++)*last;
                else if(d==last)
                s=s+(int)Math.pow(10,c++)*first;
                else
                s=s+(int)Math.pow(10,c++)*d;
                m=m/10;
            }
            a[i]=s;
        }
        System.out.println("UPDATED ARRAY IS");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
            }
        }
    
