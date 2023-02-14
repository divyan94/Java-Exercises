package BinaryFiles;

import java.io.*;

public class ReadBinaryDoubles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		double number;
		boolean EndOfFile = false;
		
		DataInputStream inFile = new DataInputStream(new FileInputStream("Doubles.dat"));
		System.out.println("Reading");
		
		while(!EndOfFile) {
			try {
				number = inFile.readDouble();
				System.out.println("Number is: " + number);
			}
			catch(EOFException e) {
				EndOfFile = true;
			}
		}
		
		System.out.println("\nDone");
		inFile.close();
	}

}
