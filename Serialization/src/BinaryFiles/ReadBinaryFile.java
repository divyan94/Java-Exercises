package BinaryFiles;
import java.io.*;
public class ReadBinaryFile {

	public static void main(String[] args) throws IOException{
		
		int number;	//A Number read from the file
		boolean endOfFile = false; //EOF Flag
		
		//Create the binary file Input Objects
		FileInputStream fstream = new FileInputStream("Primitive.dat");
		DataInputStream inputFile = new DataInputStream(fstream);
		System.out.println("Reading dNumbers from file");
		
		//Read the contents of the file
		while(!endOfFile) {
			try {
				number = inputFile.readInt();
				System.out.println(number + " Number");
			} catch(EOFException e) {
				endOfFile = true;
			}
		}
		
		System.out.println("\n Done");
		inputFile.close();
	}

}
