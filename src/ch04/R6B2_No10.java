package ch04;
import java.util.Scanner;
public class R6B2_No10{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int z = 0;
	int arraynew;
	public void cetak(){
		for (int i = 0; i < 12 ; i++ ) {	
			z=i+1;
			arraynew = array[i]-array[z];
			if (arraynew % 2 == 0) {
				System.out.print(arraynew+", ");
			}
		}
	}

}