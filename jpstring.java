import java.util.Scanner;


public class jpstring 
{
    static int temp=1000000007;
    static int pow(int x, int y)
    {
        int res = 1;     // Initialize result
     
        while (y > 0)
        {
            // If y is odd, multiply x with result
            if (y%2!=0)
                res = res*x%temp;
     
            y = y>>1; // y = y/2
            x = x*x%temp;  // Change x to x^2
        }
        return res;
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a<b){
				System.out.println((pow(a-1, a)*pow(a, b-a))% temp);
				
			}
			else
			{
				System.out.println(pow(a-1, b));
			}
			
		}
	}

}
/*
 CodeChef is a non-commercial competitive programming community

Username
 
Password
Forgot Password Login
  
New User
PRACTICE
COMPETE
DISCUSS
COMMUNITY
HELP
ABOUT
Home  » JP And Strings » All Submissions » rishabmps [12324288]
Solution: 12324288
CodeChef submission 12324288 (JAVA) plaintext list. Status: AC, problem PEC004, contest CODECHEF. By rishabmps (rishabmps), 2016-12-23 08:43:15.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
 class Solution {
 
	static class FastScanner {
		private BufferedReader reader;
		private StringTokenizer tokenizer;
 
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
		}
 
		public String next() throws IOException {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}
 
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner();
		int q = in.nextInt();
		int n,l;
		while(q>0){
			n = in.nextInt();
			l = in.nextInt();
			if(n<l){
				System.out.println((modpow(n-1, n, 1000000007)*modpow(n, l-n, 1000000007))% 1000000007);
				
			}
			else{
				System.out.println(modpow(n-1, l, 1000000007));
			}
			q--;
		}
 
	}
	public static long modpow(long a, long b, long m) {
	    long ret = 1;
	    while(b > 0) {
	        if((b & 1) == 1) ret = ret * a % m;
	        a = a * a % m;
	        b >>= 1;
	    }
	    return ret;
	}
 
} 
Comments 
CodeChef is a non-commercial competitive programming community
About CodeChef About Directi CEO's Corner C-Programming Programming Languages Contact Us
© 2009 Directi Group. All Rights Reserved. CodeChef uses SPOJ © by Sphere Research Labs
In order to report copyright violations of any kind, send in an email to copyright@codechef.com
CodeChef a product of Directi
The time now is: 07:25:11 AM
Your IP: 14.139.155.24
CodeChef - A Platform for Aspiring Programmers 
CodeChef was created as a platform to help programmers make it big in the world of algorithms, computer programming and programming contests. At CodeChef we work hard to revive the geek in you by hosting a programming contest at the start of the month and another smaller programming challenge in the middle of the month. We also aim to have training sessions and discussions related to algorithms, binary search, technicalities like array size and the likes. Apart from providing a platform for programming competitions, CodeChef also has various algorithm tutorials and forum discussions to help those who are new to the world of computer programming.
Practice Section - A Place to hone your 'Computer Programming Skills' 
Try your hand at one of our many practice problems and submit your solution in a language of your choice. Our programming contest judge accepts solutions in over 35+ programming languages. Preparing for coding contests were never this much fun! Receive points, and move up through the CodeChef ranks. Use our practice section to better prepare yourself for the multiple programming challenges that take place through-out the month on CodeChef.
Compete - Monthly Programming Contests and Cook-offs 
Here is where you can show off your computer programming skills. Take part in our 10 day long monthly coding contest and the shorter format Cook-off coding contest. Put yourself up for recognition and win great prizes. Our programming contests have prizes worth up to INR 20,000 (for Indian Community), $700 (for Global Community) and lots more CodeChef goodies up for grabs.

Programming Tools	Practice Problems	Initiatives
Online IDE	Easy	Go for Gold
Upcoming Coding Contests	Medium	CodeChef for Schools
Contest Hosting	Hard	Campus Chapters
Problem Setting	Challenge	
CodeChef Tutorials	Peer	
CodeChef Wiki	School	
FAQ's	

 */
/*
3
2 2
2 1
3 2
*/