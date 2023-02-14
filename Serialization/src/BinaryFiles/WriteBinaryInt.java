package BinaryFiles;
import java.io.*;
public class WriteBinaryInt {

	public static void main(String[] args) throws IOException{
		
		int[] numbers = {2,4,6,8,10};
		
		DataOutputStream outFile = new DataOutputStream(new FileOutputStream("Numbers.dat"));
		System.out.println("Writing to file");
		for(int i = 0; i < numbers.length; i++) {
			outFile.writeInt(numbers[i]);
		}
		System.out.println("End");
		outFile.close();
	}

}
