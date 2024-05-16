import java.util.*;
class nsd
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String s="";
        int l,i;
        char ch,ch2;
        System.out.println("Enter a sentence");
        s=ob.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            ch2=s.charAt(i+1);
            int m=ch;
            int n=ch2;
            if(n==m+1)
            {
                System.out.print(ch+"," +ch2);
            }
            
            
        }
    }
}