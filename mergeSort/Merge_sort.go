package main 

import (
	"fmt"
)

var maxInt int = 1<<31 - 1;

func Merge(a []int,p int, q int, r int){

	var i,j,k int
	n1 := q -p;
	n2 := r-q;
	
	l1 := make([]int,n1 + 1, n1 + 2 )
	r2 := make([]int,n2 ,n2 + 1)
	
	for i,_ = range l1 {
		l1[i] = a[i + p] 

	}
	l1 = l1[:cap(l1)]
	l1[n1 + 1  ] = maxInt
	
	for i,_ = range r2{
		r2[i] = a[i + q + 1]
	}
	r2 = r2[:cap(r2)] 
	r2[n2] = maxInt
	
	
	
	for i = p ; i <= r ; i++{
		
		if l1[j] <= r2[k] {
			//fmt.Print(i,j,k,l1[j],r2[k],"X")
			
			a[i] = l1[j]
			j += 1
		
		} else {
			a[i] = r2[k]
			k += 1
		}
	}
	
}

func MergeSort(a []int,i int,j int){
	
	if i < j {
		
		q := (i+j)/2
		
		MergeSort(a,i,q)
		MergeSort(a,q+1,j)
		
		Merge(a,i,q,j)
	}
}

func main() {

	a := [...]int{5,2,4,6,1,3,8,9}
	b := a[:]
	
	MergeSort(b,0,len(a) - 1)
	
	fmt.Print(a)
}

