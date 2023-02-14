package BinaryFiles;
import java.io.*;
public class WriteBinaryString {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s = "";
		boolean EOF = false;
	DataInputStream inFile = new DataInputStream(new FileInputStream("Strings.dat"));
	
	while(!EOF) {
		try {
	s = inFile.readUTF();
	System.out.println("String is: " + s);
	} catch(EOFException e) {
		EOF = true;
	}
	}
	inFile.close();
	}
}
