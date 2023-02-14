package BinaryFiles;
import java.io.*;
public class WriteBinaryDoubleWithAppend {

	public static void main(String[] args) throws IOException{
		
		double[] dou = {3.1, 45, 6.89};
		
		DataOutputStream outFile = new DataOutputStream(new FileOutputStream("Doubles.dat", true));
		
		for(int i = 0; i < dou.length; i++) {
			outFile.writeDouble(dou[i]);
		}

		outFile.close();
		System.out.println("Writing end");
		
	}

}
