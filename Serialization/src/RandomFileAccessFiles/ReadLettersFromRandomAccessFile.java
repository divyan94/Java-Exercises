package RandomFileAccessFiles;
import java.io.*;
public class ReadLettersFromRandomAccessFile {

	public static void main(String[] args) throws IOException{
	
		final int CHAR_SIZE_IN_BYTES = 2;
		long bytenum;
		char ch;
		boolean eOF = false;
		RandomAccessFile ioFile = new RandomAccessFile("LowerLetters.dat","r");
		//Move to the character 2. This is the 6th char from the start of file.
		while(!eOF) {
			try {
				bytenum = CHAR_SIZE_IN_BYTES * 1;
				ioFile.seek(bytenum);
				ch = ioFile.readChar();
				System.out.println("ch is: " + ch);
			} catch(EOFException e) {
				eOF = true;
			}
			break;
		}
		
		ioFile.close();
	}

}
