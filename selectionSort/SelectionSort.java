import java.util.Arrays;


public class SelectionSort {

	/**
	 * @param args
	 */
	
	public static void selectionSort(int a[]){
		
		int n = a.length - 1,j,key,index;
		for(int i= 0 ; i < n ; i++){
			
			key = a[i];
			index = i;
			j = i + 1;
			
			while( j < a.length  ){
				if(key < a[j] ){
					key = a[j];
					index = j;
				}
				j++;
					
			}
			a[index] = a[i];
			a[i] = key;
			
		}
		
		
	}
	public static void main(String[] args) {
		
		int []a = {5, 2, 4, 6, 1, 3};
		
		selectionSort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
