import java.util.*;
class linear_search
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [5];
        int n,pos=0,i,f=0;
        System.out.println("Enter 5 nos");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("Enter a number to be searched");
        n=ob.nextInt();        
        for(i=0;i<5;i++)
        {
            if(n==a[i])
            {
                f=1;
                pos=i;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("The number "+n+" is found at "+pos+" index/position");
        }
        else
        {
            System.out.println("The number "+n+" is not found.");
        }
    }
}