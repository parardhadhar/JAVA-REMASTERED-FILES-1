import java.util.*;
class binaryrff
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]= new int [5],i,f=0,lb=0,ub=0,m,num;
        System.out.println("Enter 5 nos");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("Enter a no to be searched");
        num=ob.nextInt();
        while(lb<=ub)
        {
            m=(lb+ub)/2;
            if(num>a[m])
            lb=m+1;
            else if(num<a[m])
            ub=m-1;
            else if(num==a[i])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println(num+"is found at the index position:");
        else
        System.out.println(num+"is not found in the array");
    }
}
        