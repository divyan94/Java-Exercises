package Serialization1;
import java.io.*;

public class DogDemoDeserialization {

	public static void main(String[] args) throws Exception{
		

		FileInputStream fstream = new FileInputStream("DogObjects.dat");
		ObjectInputStream inFile = new ObjectInputStream(fstream);
		Dog[] dogs = new Dog[8];
		//Reading the serialized objects from the file
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = (Dog) inFile.readObject();
		}
		inFile.close();
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
	System.out.println("End");
	}

}
