package main 

import (
	"os"
	"fmt"
)

func main() {
	
	var a,b int
	
	inFile,err1 := os.Open("adunare.in")
	outFile,err2 := os.Create("adunare.out")
	
	defer func() {
	 if inFile != nil {
	 	 inFile.Close()
	 }
	 
	 if outFile != nil {
	 	outFile.Close()
	 }
		
	 
	 }()
	
	if err1 != nil || err2 != nil {
		panic(err2)
	}
	
	_,err1 = fmt.Fscanf(inFile,"%d \n %d",&a,&b)
	
	fmt.Fprintf(outFile,"%d",a+b) 
}

