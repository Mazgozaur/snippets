/*
 * main.c
 *
 *  Created on: Jul 15, 2012
 *      Author: Catalin
 */

#include<stdio.h>

void printV(int *v,int n){
	int i;
	for(i=0 ; i < n ;i++){
		printf("%d,",v[i]);
	}
}

void selectionSort(int *a,int n){
	int i,j,key,n2,index;
	n2 = n - 1;

	for(i=0 ; i < n2 ; i++ ){

		key = a[i];
		index = i;
		j = i + 1;

		while(j < n){
			if(key < a[j]){
				key = a[j];
				index = j;
			}

			j++;
		}

		a[index] = a[i];
		a[i] = key;
	}

}


int main(){

	int v[6] = {5,2,4,6,1,3};


	selectionSort(&v,6);
	printV(&v,6);
	return 0;

}
