package BinaryFiles;

import java.io.*;

public class WriteBinaryDouble {

	public static void main(String[] args) throws IOException{
		
		double[] dou = {2.3, 4.5, 6.8};
		
		DataOutputStream outFile = new DataOutputStream(new FileOutputStream("Doubles.dat"));
		
		for(int i = 0; i < dou.length; i++) {
			outFile.writeDouble(dou[i]);
		}

		outFile.close();
		System.out.println("Writing end");

	}

}
