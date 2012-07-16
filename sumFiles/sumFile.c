/*
 * main.c
 *
 *  Created on: Jul 15, 2012
 *      Author: Catalin
 */

#include<stdio.h>


int main(){

	FILE * inFile = fopen("adunare.in","r");
	FILE * outFile = fopen("adunare.out","w");
	int a,b;

	if( inFile == NULL || outFile == NULL ){
		fprintf(stderr,"fopen error");
		return 1;
	}

	fscanf(inFile,"%d \n %d",&a,&b);

	fprintf(outFile,"%d",a+b);

	return 0;

}
