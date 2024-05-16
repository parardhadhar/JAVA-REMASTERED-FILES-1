import java.util.*;
class binary_search
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [5];
        int lb=0,ub=4,m=0,f=0,i,num;
        System.out.println("Enter 5 nos in ascending order");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();// 1 2 3 4 5
        }
        System.out.println("Enter a number to be searched");
        num=ob.nextInt();//4
        while(lb<=ub)
        {
            m=(lb+ub)/2;//(0+4)/2=2//(4+4)/2=4
        if(num>a[m])
         lb=m+1;//3+1
         
        else if(num<a[m])
        ub=m-1;//5-1
        
        else if(num==a[m])
        {
            f=1;
            break;
        }
        
    }
    if(f==1)
    {
        System.out.println("The number "+num+" is found at the index position "+(m+1));
    }
    else
    {
        System.out.println("The number "+num+" is not found.");
    }
}
}