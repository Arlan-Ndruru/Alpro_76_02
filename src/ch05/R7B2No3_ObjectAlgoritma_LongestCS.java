package ch05;
import java.util.Scanner;
public class R7B2No3_ObjectAlgoritma_LongestCS{
public static void main(String[] args){ 
		R7B2No3_Algoritma_LongestCS lcs = new R7B2No3_Algoritma_LongestCS(); 
		System.out.println(" Program Algoritma Longest Common Subsequence : ");
		
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan Pertama : ");
		String s1 = a.nextLine();
		
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan Kedua : ");
		String s2 = b.nextLine();

		char[] X = s1.toCharArray(); 
		char[] Y = s2.toCharArray(); 
		int m = X.length; 
		int n = Y.length; 

		System.out.println(" Length Dari LCS Adalah : " + lcs.lcs(X, Y, m, n)); 
	} 
}