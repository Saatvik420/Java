/*import java.util.*;
import java.lang.*;

class GCD
{
	public static int gcdExtended(int a, int b, int x, int y)
	{
		if (a == 0)
		{
			x = 0;
			y = 1;
			return b;
		}

		int x1=1, y1=1; 
		int gcd = gcdExtended(b%a, a, x1, y1);

		x = y1 - (b/a) * x1;
		y = x1;

		return gcd;
	}
	public static void main(String[] args)
	{
		int x=1, y=1;
		int a = 35, b = 15;
		int g = gcdExtended(a, b, x, y);
		System.out.print("gcd(" + a + " , " + b+ ") = " + g);
	}
}*/

import java.util.*;
import java.lang.*;

class GFG
{
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		
		return gcd(b%a, a);
	}
	public static void main(String[] args)
	{
		int a = 10, b = 15, g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);
		
		a = 35; b = 10;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);
		
		a = 31; b = 2;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);

	}
}

