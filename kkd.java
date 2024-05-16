import java.util.*;
class kkd
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String x,s="",s1="";
        char ch;
        int len,len2,i,k;
        System.out.println("enter a sentence");
        x=ob.nextLine();
        len=x.length();
        for(i=0;i<len;i++)
        {
            ch=x.charAt(i);
            if(ch!=' ')
            {
                s=s+ch;
                
            }
            else
            {
                len2=s.length();
                for(k=len2-1;k>=0;k--)
                {
                    s1=s1+s.charAt(k);
                }
                if(s.compareTo(s1)==0)
                System.out.println(s);
                s="";
                s1="";
            }
        }
    }
    
}