package RandomFileAccessFiles;
import java.io.*;
public class WriteLetters {

	public static void main(String[] args) throws IOException{
		
		char[] letters = {'a','b','c','d'};
		System.out.println("Opening a File");
		
		RandomAccessFile ioFile = new RandomAccessFile("LowerLetters.dat", "rw");
		
		System.out.println("Writing data");
		
		//Sequentially write letters array to file
		for (int i = 0; i < letters.length; i++) {
			ioFile.writeChar(letters[i]);
		}
		ioFile.close();
		System.out.println("End");
	}

}
