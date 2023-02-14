package Serialization1;
import java.io.*;
public class ScoresDemo {

	public static void main(String[] args) throws IOException{
		
		TestScores[] test1 = new TestScores[3];
		double[] scores1 = {23, 45, 65, 34};
		double[] scores2 = {34, 35, 23, 32};
		double[] scores3 = {78, 36, 21, 78};
		
		test1[0] = new TestScores(scores1);
		test1[1] = new TestScores(scores2);
		test1[2] = new TestScores(scores3);
		//Writing to File
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Scores.dat"));
		System.out.println("Writing data to file");
		for(int i = 0; i < test1.length; i++) {
			oos.writeObject(test1[i]);
		}
		System.out.println("Average of First Score set:" + test1[0].getAvg());
		System.out.println("Average of First Score set:" + test1[1].getAvg());
		System.out.println("Average of First Score set:" + test1[2].getAvg());
		oos.close();
		System.out.println("End of Writing to File");
		
		
	}

}
