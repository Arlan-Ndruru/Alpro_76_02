package ch05;

 class R7B2No4_Algoritma_LongestIS{
	static int lis(int arr[],int n){ 
		int lis[] = new int[n]; 
		int i,j,max = 0; 

		/* inialisasi */
		for ( i = 0; i < n; i++ ) 
			lis[i] = 1; 

		/* menghitung nilai lis dari atas kebawah */
		for ( i = 1; i < n; i++ ) 
			for ( j = 0; j < i; j++ ) 
						if ( arr[i] > arr[j] && lis[i] < lis[j] + 1) 
					lis[i] = lis[j] + 1; 

		/* Mengambil nilai tertinggi dari LIS */
		for ( i = 0; i < n; i++ ) 
			if ( max < lis[i] ) 
				max = lis[i]; 

			return max; 
	}
}