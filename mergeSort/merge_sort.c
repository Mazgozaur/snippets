

#include<stdio.h>
#include<stdlib.h>

int maxInt = 1<<31 - 1;

void printV(int *v,int n){
	int i;
	for(i=0 ; i < n ;i++){
		printf("%d,",v[i]);
	}
}


void merge(int *a,int p,int q,int r){
	int n1 = q - p + 1;
	int n2 = r - q;
	int i,j=0,k=0;


	int *l1 = malloc(sizeof(int)*(n1 +1));
	int *r2 = malloc(sizeof(int)*(n2 +1));
	l1[n1 ] = maxInt;
	r2[n2 ] = maxInt;

	for(i=0; i < n1 ; i++){

		l1[i] = a[p + i];
	}

	for(i=0 ; i < n2;i++){
		r2[i] = a[q + i + 1];
	}

	for(i=p ; i <= r ; i++ ){

		if( l1[j] <= r2[k]){
			a[i] = l1[j++];
		}
		else{
			a[i] = r2[k++];
		}
	}

	free(l1);
	free(r2);
}


void mergeSort(int *a,int p,int r){
	int q;
	if(p < r){
		q = (p + r)/2;
		mergeSort(a,p,q);
		mergeSort(a,q+1,r);
		merge(a,p,q,r);

	}

}



int main(){

	int v[6] = {5,2,4,6,1,3};


	mergeSort(v,0,5);
	printV(v,6);
	return 0;

}
