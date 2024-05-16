import java.util.*;

class palindrom_String
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int l,i;
        boolean x;
        char ch;
        String s,s1="",rev="";
        System.out.println("Enter a word");
        s=ob.nextLine();
        s=s.toUpperCase();
        s1=s;//madam
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            rev=rev+ch;
        }
        x=s1.equals(rev);
        if(x==true)
        {
            System.out.println("Yes "+s1+" is a palindromic string.");
            
        }
        else
        {
            System.out.println("No "+s1+" is not a palindromic string.");
        }
        
    }
}