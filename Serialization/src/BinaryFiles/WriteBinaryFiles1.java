package BinaryFiles;
import java.io.*;
public class WriteBinaryFiles1 {

	public static void main(String[] args) throws IOException{
		
		String s = "Divya";
		int i = 10, j = 20;
		double d = 20; float f = 2.3f;
		char c = 'D';boolean b = false;
		
		//Create the binary file Output Obects
		FileOutputStream fstream = new FileOutputStream("Primitive.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		System.out.println("Writing some numbers into file: ");
		outputFile.writeChars(s);
		outputFile.writeInt(i);
		outputFile.writeInt(j);
		outputFile.writeFloat(f);
		outputFile.writeDouble(d);
		outputFile.writeChar(c);
		outputFile.writeBoolean(b);
		outputFile.close();
		System.out.println("End of Writing binary data");
		

	}

}
