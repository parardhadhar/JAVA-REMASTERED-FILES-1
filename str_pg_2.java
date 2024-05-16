import java.util.*;
class str_pg_2
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String x,s="";   //I am good_ 
        char ch,ch1;
        int len,i,c=0;
        System.out.println("Enter a sentence");
        x=ob.nextLine();
        x=x+" ";
        len=x.length();//10
        for(i=0;i<len;i++)
        {
          ch=x.charAt(i);
          if(ch!=' ')
          {
              s=s+ch;//good
          }
          else
          {
              c++;//3
              System.out.println(s);
              s="";
          }
        }
        System.out.println("Count of words in the sentence is= "+c);
    }
}
        