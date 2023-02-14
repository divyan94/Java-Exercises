package BinaryFiles;
import java.io.*;
public class ReadBinaryString {

	public static void main(String[] args) throws IOException{
		
		
		String s = "Divya";
		
		DataOutputStream oFile = new DataOutputStream(new FileOutputStream("Strings.dat"));
		
		oFile.writeUTF(s);
		oFile.close();
		System.out.println("End");
	}

}
