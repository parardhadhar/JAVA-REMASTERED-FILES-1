import java.util.*;
class hsh
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        int c;
        char ch;
        System.out.println("Enter a character");
        ch=ob.next().charAt(0);
        c=(int)ch;
        c=c+10;
        System.out.println("The 10th ascii character is"+(char)c);
        
    }
}