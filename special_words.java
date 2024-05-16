import java.util.*;
class special_words
{
    void JavaRemastered()
    {
        Scanner ob=new Scanner(System.in);
        int f=0,l,i;
        char ch,ch1;
        String s;
        System.out.println("Enter a word");
        s=ob.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(0);//madam
            ch1=s.charAt(l-1);
            if(ch==ch1)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("YEAH MAN ITS A SPECIAL WORD");
            
        }
        else
        {
            System.out.println("NO ITS NOT A SPECIAL WORD");
        }
        }
    }
