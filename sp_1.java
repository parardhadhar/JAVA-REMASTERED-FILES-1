import java.util.*;
class sp_1
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int s,i,n;
        System.out.println("enter the no of elemente");
        n=ob.nextInt();
        int a[]=new int[n]; 
        System.out.println("Enter those elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("ENter the element to be searched");
        s=ob.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==n)
            {
                break;
            }
            
        }
        if (i < n)
           System.out.println( " found at index " 
                                   + i + " in the array");
       else
           System.out.println( " not found in the array");
        
    }
}