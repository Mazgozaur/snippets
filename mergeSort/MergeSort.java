import java.util.Arrays;


public class MergeSort {

	/**
	 * @param args
	 */
	

	
	public static void merge(int a[],int p,int q,int r){
		int n1 = q - p;
		int n2= r -q;
		
		int i,j;
		int L[] = new int[n1 + 2];
		int R[] = new int[n2 + 1];
		
		for(i=0 ; i <= n1 ; i++){
			L[i] = a[p + i];
		}
		L[i] = Integer.MAX_VALUE;
		
		for(i=0 ; i < n2 ; i++ ){
			R[i] = a[q + 1 +  i ];
		}
		
		R[i] = Integer.MAX_VALUE;
		
		i=0;j=0;
		for(int k=p ; k <= r ; k++){
			
			if( L[i] <= R[j]){
				a[k] = L[i++];
			}
			else{
				a[k] = R[j++];
			}
		}
		
	}
	
	public static void mergeSort(int a[],int p,int r){
		int q;
		
		if(p < r){
			q = (p+r)/2;
			
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]  = {1,2,9,3,4,5,3,6};
		
		mergeSort(a, 0, a.length - 1);
		
		
		System.out.println(Arrays.toString(a));

	}

}
