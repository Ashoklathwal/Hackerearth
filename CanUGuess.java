import java.util.*;
public class CanUGuess
{
	
	    public static void main(String args[])
	    {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        int temp;
	        for (int i = 0; i < t; i++)
	            {
	             int count=0;
	             temp=s.nextInt();
	             for(int j=1;j<=(int)Math.sqrt(temp);j++)
	                {
	            	  if(temp%j==0)
	            	  {  
	                     if(temp/j==j)
	                        count++;
	                      else
	                    	count=count+2;;
	                  }
	                } 
	              System.out.println(count);    
	            }
	    }
}	

/*
10
2
6
12
60
5
169
1
8
23
100

2
4
6
12
2
3
1
4
2
9
*/