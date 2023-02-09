package studio3;

import java.util.Scanner;

public class Sieve 
{
	public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Provide a Number: ");
			int n = in.nextInt();
		
			boolean[] prime = new boolean[n+1];
	
			for(int i = 0; i <= n; i++)
			{
				prime[i]=true;
			}
			for(int p=2;p<=n;p++) 
			{
				if(prime[p] == true) //multiple of p greater than or equal to square of numbers= multiple p + less than p^2
				{
					for(int i=p*2;i<=n;i=i+p) 
						{
							prime[i]=false;
						}
				}
			}
			for(int a=2;a<=n;a++) //PRINT
			{
				if(prime[a] == true) 
					{
						System.out.println(a);
					}
			}
		}
}