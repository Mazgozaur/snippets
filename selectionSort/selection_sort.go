package main 

import (
	"fmt"
)

func selectionSort(a []int) {
	var  j,index,key,n int
	
	n = len(a) - 1
	
	for i:= 0 ; i < n ; i++ {
		
		key = a[i]
		index = i
		j = i + 1;
		
		for ; j < len(a) ; j++ {
			
			if key < a[j] {
				key = a[j]
				index = j
			}
			
		}
		a[index] = a[i]
		a[i] = key
	}
}

func main() {

	a := [...]int{5,2,4,6,1,3}
	b := a[:]
	
	selectionSort(b)
	fmt.Print(a)
}

