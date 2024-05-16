import java.util.*;
class Integer2Letter
{
     void main()
     {
         Scanner ob=new Scanner(System.in);
         int n;
         System.out.println("Enter an Integer");
         n=ob.nextInt();
         if(n>0 && n<27)
         {
             char ch= (char)(n+64);
             System.out.println("the corresponding letter is="+ch);
         }
         else
         {
             System.out.println("Please enter the correct range");
         }
     }
}