import java.util.Scanner;


public class palindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			String str=sc.next();
			int m=0;
			int n=str.length()-1;
			boolean flag=true;
			while(m<n)
			{
				if(str.charAt(m)!=str.charAt(n))
				{
					flag=false;
					break;
				}
				else
				{
					m++;
					n--;
				}
					
			}
			if(flag)
                System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
/*
3
abba
aaaa
abcd
*/