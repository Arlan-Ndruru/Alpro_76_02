package ch07;

public class R11B2No2c_ObjectAlgoritma_CocktailShakerS{
	public static void main(String[] args){
		System.out.println(" Program Algoritma Cocktail Shaker Sort : ");
		System.out.println();
		R11B2No2c_Algoritma_CocktailShakerS ob = new R11B2No2c_Algoritma_CocktailShakerS(); 
		int a[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		ob.cocktailSort(a); 
		System.out.print(" Urutan Array Setelah di CocktailShakerSort : "); 
		ob.printArray(a); 
	}

}