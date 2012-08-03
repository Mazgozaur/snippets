package main 

import (
	"fmt"
)

func insertionSort(b []int) {
	fmt.Print(b)
	var j,i,key int
	for i = 1 ; i < len(b) ; i++ {
		
		key = b[i]
		j = i - 1
		for ; j > -1 && b[j] > key ; j-- {
			
			b[j+1] = b[j]
			
		}
		b[j+1] = key
		
		
		
	}
}

func main() {

	a := [...]int{5,2,4,6,1,3}
	b := a[:]
	
	insertionSort(b)
	fmt.Print(a)
}

