import java.util.*;
class delete_last
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String s,s1="";
        int p;
        System.out.println("Enter a string");
        s=ob.nextLine();
        p=s.lastIndexOf(' ');
        s1=s.substring(0,p);
        System.out.println("The new String is:"+s1);
    }
}