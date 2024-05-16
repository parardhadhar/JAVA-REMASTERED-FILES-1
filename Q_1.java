import java.util.*;
class Q_1
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,n,l,s=0,m;
        System.out.println("Enter the size of the array");
        n=ob.nextInt();
        char ch[]=new char [n];
        
        for(i=0;i<n;i++)
        {
            ch[i]=ob.next().charAt(0);
        }
        for(i=0;i<n;i++)
        {
            s=s+ch[i];
            
            char c = Character.toUpperCase(ch[i]);
            System.out.println("The charcatrers are="+ch);  
           
        }
        System.out.println();
       System.out.println("The sum of ascii values is="+s);
    }
}
