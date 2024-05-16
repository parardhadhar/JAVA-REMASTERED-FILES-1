import java.util.*;
class pig_latin
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String n,s="", str="",x="",y="",newstr="";
        char ch,ch1;
        int i,k,len,len2;
        System.out.println("Enter a sentence");
        n=ob.nextLine();
        n=n.toUpperCase();
        System.out.println("The original sentence is:"+n);
        len=n.length();
        for(i=0;i<len;i++)
        {
            ch=n.charAt(i);
            if(ch!=' ')
            {
                s=s+ch;
            }
            else
            {
                len2=s.length();
                for(k=0;k<len2;k++)
                {
                    ch1=s.charAt(k);
                    if(ch!='A'||ch1!='E'||ch1!='I'||ch1!='O'||ch1!='U')
                    break;
                }
                x=s.substring(0,k);
                y=s.substring(k);
                str=y+x+"AY";
                newstr=newstr+str+" ";
                s="";
                len2=0;
                x=y=str="";
                }
            }
            System.out.println("new string is: "+newstr);
        }
    }
