import java.util.*;
class Icse2006
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        
        
        String s,s1="";
        s="January 26 is celebrated as the Republic Day of India";
        s1=s.replace('2','1');
        s1=s1.replace('6','5');
        s1=s1.replace("January","August");
        s1=s1.replace("Republic","Independence");
        System.out.println("INPUT:="+s);
        System.out.println("DESIRED OUTPUT="+s1);
    }
}