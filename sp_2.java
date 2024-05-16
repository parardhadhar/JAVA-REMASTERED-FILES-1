import java.util.*;
class sp_2
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,i,c=0,v=0;
        char x,ch;
       
        char d[]=new char[10];
        System.out.println("Enter those characters");
        for(i=0;i<10;i++)
        {
             d[i] = ob.next().charAt(0);
        }
        for(i=0;i<10;i++)
        {
            x=d[i];
            if(x>='A' && x<='Z')
            {
                c++;
            }
             ch=Character.toUpperCase(x);
             if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             v++;
            
        }
        System.out.println("The no of uppercase charaters are="+c);
        System.out.println("The no of vowels are="+v);
        
    }
}