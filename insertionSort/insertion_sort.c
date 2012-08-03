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
		printf("%d",v[i]);
	}
}

void insertionSort(int *v,int n){
	int i,j,key;

	for(i=1 ; i < n ;i++){
		key = v[i];
		j= i - 1;

		while( j > -1 && v[j] > key){
			v[j+1] = v[j];
			j--;
		}
		v[j+1] = key;
	}

}

int main(){

	int v[6] = {5,2,4,6,1,3};


	insertionSort(&v,6);
	printV(&v,6);
	return 0;

}
