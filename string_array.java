import java.util.*;
class string_array
{
    void mian()
    {
       Scanner ob=new Scanner(System.in);
       int i,l,j;
       String m;
        String a[]= new String [5];
        System.out.println("enter 5 words");
        for(i=0;i<5;i++)
        {
            a[i]=ob.nextLine();
            
        }
        for(i=0;i<5;i++)
        {
            m=a[i];//aman
            m=m+"";
            m=m.toUpperCase();
            l=m.length();
            for(j=0;j<l;j++)
            {
                if(m.charAt(0)=='A')
                {
                    System.out.println("The string is"+m);
                }
            }
                    
                }
                
                
            }
            }
            
        
        
    
