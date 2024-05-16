import java.util.*;
class main{
    void main()
    {
           Scanner ob=new Scanner(System.in);
         String s,str="";
        int l,i;
        char ch,ch1;
        System.out.println("Enter the string s ");
        s=ob.nextLine();
        l=s.length();
        for(i=l-1;i>=0;i--)
        
        {
          ch=s.charAt(i);
          ch1=s.charAt(0);
          ch1-=32;
          
          str=ch1+s.substring(1,l);
        }
        System.out.println(str);
    }
}
