import java.util.*;
class data_conversion
{
      void tostring()//This converts numeric value to String object; for eg= 78---->"78"
    {
        
        int x=2005;
        String y="";
        y=Integer.toString(x);
        System.out.println("THE STRING IS="+y);
    }
    void parse()//This converts the numeric string value to corresponding primitive data type
    {
      String z="28";
      int n;
      n=Integer.parseInt(z);
      System.out.println("THE INTEGER IS="+n);
    }
    void valueof()//This converts numeric string to corresponding primitive data type
    {
        String p="24";
        int l=Integer.valueOf(p);
        System.out.println("THE INTEGER IS="+l);
    }
    
}