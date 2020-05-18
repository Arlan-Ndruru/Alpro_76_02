package ch08;
import java.io.*; 
import java.math.*; 
public class R12B2No4c_MR{
	static int power(int x, int y, int p) { 
		
		int res = 1;
		x = x % p; 
		while (y > 0) { 
			if ((y & 1) == 1) 
				res = (res * x) % p; 
			y = y >> 1;
			x = (x * x) % p; 
		} 
		return res; 
	} 
	
	static boolean miillerTest(int d, int n) { 
		int a = 2 + (int)(Math.random() % (n - 4)); 
		int x = power(a, d, n); 
	
		if (x == 1 || x == n - 1) 
			return true; 
		while (d != n - 1) { 
			x = (x * x) % n; 
			d *= 2; 
		
			if (x == 1) 
				return false; 
			if (x == n - 1) 
				return true; 
		} 
		return false; 
	} 
	static boolean isPrime(int n, int k) { 
		if (n <= 1 || n == 4) 
			return false; 
		if (n <= 3) 
			return true; 
		int d = n - 1; 
		while (d % 2 == 0) 
			d /= 2; 
		for (int i = 0; i < k; i++) 
			if (!miillerTest(d, n)) 
				return false; 
		return true; 
	}
}