package Serialization1;

import java.io.*;

public class ScoresDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		TestScores[] test1 = new TestScores[3];
		//Reading to File
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Scores.dat"));
		System.out.println("Reading data to file");
		for(int i = 0; i < test1.length; i++) {
			test1[i] = (TestScores)ois.readObject();
		}
		
		for(int i = 0; i < test1.length; i++) {
			System.out.println("Average of "+ i + test1[i].getAvg());
		}
		
		ois.close();
	}

}
