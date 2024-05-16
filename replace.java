import java.util.*;
class replace
{
    void mian()
    {
       Scanner ob=new Scanner(System.in);
       int i,l,j;
       String m, replace="";
       System.out.println("enter a word");
       m=ob.nextLine();
       m=m.toUpperCase();
       l=m.length();
       for(i=0;i<l;i++)
       {
           
           char ch=m.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
           {
               replace=m.replace(ch,'*');
           }
           else
           {
               replace=m.replace(ch,'@');
           }
        }
        System.out.println("The replaced value is"+replace);
    }
}