import java.util.*;
class str_pg_1
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String x;//I am good.
        char ch;
        int len,i,c1=0,c2=0,c3=0,c4=0;
        System.out.println("Enter a sentence");
        x=ob.nextLine();
        len=x.length();
        for(i=0;i<len;i++)
        {
             ch=x.charAt(i);
             if(Character.isUpperCase(ch)==true)
             { 
                 c1++;
                 
             }
               else if(Character.isLowerCase(ch)==true)
               {
                   c2++;
               }
                 if(Character.isDigit(ch)==true)
                 {
                     c3++;
                 }
                   if(Character.isWhitespace(ch)==true)
                   {
                       c4++;
                   }
        }
        System.out.println("No of upper case characters are= "+c1);
        System.out.println("No of lower case characters are= "+c2);
        System.out.println("No of digits are= "+c3);
        System.out.println("No of whitespace characters are= "+c4);
        
    }
}