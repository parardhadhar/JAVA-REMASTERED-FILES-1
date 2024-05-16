import java.util.*;
class separate
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int l,i;
        String s,s1="",s2="";
        char ch;
        System.out.println("Enter a word");
        s=ob.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                s1=s1+ch;
            }
            else
            {
                s2=s2+ch;
            }
        }
        System.out.println("INPUT="+s+"  Output:Vowel word="+s1+"   Consonant word:"+s2);
    }
    
}