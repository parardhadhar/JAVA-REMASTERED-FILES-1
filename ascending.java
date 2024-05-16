//2 6 8 9 10

import java.util.*;
class ascending
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [5];
        int i,f=0;
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
            
        }
        for(i=;i<=5;i++)
        {
            if(a[i]<a[i+1])
            {
                f=1;
            }
            
            
        }
        if(f==1)
        {
            System.out.print("Yes");
        }
    }
}