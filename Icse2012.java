import java.util.*;
public class Icse2012
{
    void pagla()
    {
       Scanner ob=new Scanner(System.in);
       int i,j,c=0,l,len2;
       char ch,ch2,ch3;
       String s,s1="";
       System.out.println("Enter a sentence");
       s=ob.nextLine();
       s=s.toUpperCase();
       l=s.length();
       for(i=0;i<l-1;i++)
       {
           ch=s.charAt(i);
           ch2=s.charAt(i+1);
           if(ch==ch2)
           c++;
       }
       if(c>0)
       {
           System.out.println("INPUT:-"+s);
           System.out.println("frequency is:-"+c);
       }
       else
       {
           System.out.println("No double letter sequence founded in the string entered");
       }
       
    }
}
    
