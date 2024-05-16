import java.util.*;
class q2
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String s="",s1="",s2="",newstr="";
        char ch;
        int l,i;
        System.out.println("Enter a sentence");
        s=ob.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)//fruit
        {
            ch=s.charAt(i);
            if(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')
            {
                s1=s1+ch;
            }
           newstr=newstr+s1+" ";
           s=
        }
        System.out.println("After removing the vowels"+s1);
        }
    }
