import java.util.Arrays;


public class InsetionSort {

	/**
	 * @param args
	 */
	
	
	public static void insertionSort(int a[]){
		int key,j;
		for(int i = 1 ;i < a.length ; i++){
			key = a[i];
			
			j = i - 1;
			while( j > -1 && a[j] > key ){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int []a = {5, 2, 4, 6, 1, 3};
		
		insertionSort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
