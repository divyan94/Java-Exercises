package Serialization1;
import java.io.*;
import java.util.*;
public class DogDemo {

	public static void main(String[] args) throws IOException{
		
		String  name, color;
		Scanner sc = new Scanner(System.in);
		Dog[] dogs = new Dog[4];
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println("Enter the Dog's name");
			name = sc.nextLine();
			System.out.println("Enter the Dog's color");
			color = sc.nextLine();
			dogs[i] = new Dog(name, color);
		}
		
		FileOutputStream fstream = new FileOutputStream("DogObjects.dat", true);
		
		ObjectOutputStream outFile = new ObjectOutputStream(fstream);
		
		//Writing the serialize objects to the file
		try {
		for(int i = 0; i < dogs.length; i++) {
			outFile.writeObject(dogs[i]);
		}
		System.out.println("Serilized objects were written to file");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		outFile.close();
		System.out.println("End");
	}

}
