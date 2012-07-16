import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class InfoA {

	public static int[] integerParsing(byte arr[]){
		
		int i,j=0,count=1,k=0;
		byte number[] = new byte[10];
		int integers[] = new int[30];
		for(i=0;i<arr.length && arr[i] != 0 ;){
			if(count % 2 == 1){
				while(Character.isDigit(arr[i]))
					number[j++] =arr[i++];
				if(j > 0)
					integers[k++] = Integer.parseInt(new String(number,0,j));
				j=0;							
				
			}
			
			if(count % 2 == 0){
				while(( !Character.isDigit(arr[i++]) ) && arr[i] != 0);
				
				i--;
			}
			
			count++;
		}
		
		
		return integers;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		byte buff[] = new byte[50];
		int sum = 0 ;
		
		FileInputStream fis = null;
		FileOutputStream fous = null;
		try {
			fis = new FileInputStream("adunare.in");
			
			fis.read(buff);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if (fis != null && fous != null){
				fis.close();
				fous.close();
			}
				
		}
		
		
		int integers[] = integerParsing(buff);
		
		for(int i=0;i < integers.length && integers[i] > 0 ; i++){
			System.out.println(integers[i]);
		}
		
		
		sum = integers[0] + integers[1];
		
		try {
			fous = new FileOutputStream("adunare.out");
			fous.write((sum + "").getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
