package ch04;
import java.util.Scanner;
public class R6B2_No5{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int[] angka2= {2,12,20,21,22,23,24,25,26,27,28,29,32,42,52,62,72,82,92,102};

	public void cetak(){
		for (int i = 0; i < array.length ; i++ ) {	
			for (int j = 0; j < angka2.length; j++ ) {
				if (array[i]==angka2[j]) {
					System.out.println(array[i]);
				}	
			}
		}
	}
}

