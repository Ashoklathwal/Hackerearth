import java.lang.StringBuilder;
import java.util.Scanner;

class TestClass
{
    public static void main(String args[] )
    {
    //Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) 
        {
            String str=sc.next();
            //StringBuilder str=new StringBuilder(str1);
           // StringBuilder newstr=new StringBuilder();
           // int length=str1.length();
            int count=0;
            int i=0;
            for(i=0;i<str.length();i++)
            {
            	if(str.charAt(i)=='m')
            	{
            		count++;
            	break;
            	}
            }
            for(i=i+1;i<str.length();i++)
            {
            	if(str.charAt(i)=='i')
            	{
            		count++;
            	break;
            	}
            }
            for(i=i+1;i<str.length();i++)
            {
            	if(str.charAt(i)=='l')
            	{
            		//str.delete(i, i+1)
            		count++;
            		break;
                }
            }
            for(i=i+1;i<str.length();i++)
            {
            	if(str.charAt(i)=='l')
            	{
            		count++;
            	break;
            	}
            }
            for(i=i+1;i<str.length();i++)
            {
            	if(str.charAt(i)=='y')
            	{
            		count++;
            	break;
            	}
            }
    
            if(count ==5)
                System.out.println("Milly is Intelligent");
                else
                System.out.println("Milly is not Intelligent");
        }
        
        
    }
}
/*
2
mialuqlyot
admylqi
*/