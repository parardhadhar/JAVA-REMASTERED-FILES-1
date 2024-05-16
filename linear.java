import java.util.*;
class linear
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]= new int [5],i,f=0,n;
        System.out.println("Enter 5 nos");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("Enter a no to be searched");
        n=ob.nextInt();
        for(i=0;i<5;i++)
        {
            if(a[i]==n)
          
            break;
        }
      if(i<5)
     
         System.out.println("found");
        else
        System.out.println("not found");
        }
        
    }
