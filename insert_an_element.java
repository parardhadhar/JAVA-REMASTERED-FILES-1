import java.util.*;
class insert_an_element
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int [10],i,n,pos,val;
        System.out.println("Enter the no of elements to be entered in the array");
        int m=ob.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<m;i++)
        {
            a[i]=ob.nextInt();
        } 
        System.out.println("Enter the element to be inserted");
        n=ob.nextInt();
        System.out.println("Enter the position to insert this element");
        pos=ob.nextInt();
        for(i=m-1;i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=n;
        System.out.println("After inserting the array is");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
    
