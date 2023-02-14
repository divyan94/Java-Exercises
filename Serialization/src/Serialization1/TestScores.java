package Serialization1;
import java.io.*;
public class TestScores implements Serializable{

	
	private double[] score;
	private double sc;
	
	
	public TestScores(double[] scores) throws IllegalArgumentException{
	
		for(int i =0; i < scores.length;i++) {
			if(scores[i] < 0 || scores[i] > 100) {
				throw new IllegalArgumentException();
			} 
			else
				this.score[i] = scores[i];
		}
	}
	
	public double getAvg() {
		double total = 0.0;
		int len = score.length;
		for (int i = 0; i < len; i++) {
			total += score[i];
		}
		sc = total/len;
		return sc;
	}

	@Override
	public String toString() {
		 String str = "Scores: ";
	      
	      for (int i = 0; i < score.length; i++)
	         str += score[i] + " ";
	      
	      str += "  Average = " + getAvg();
	      return str;
		//return "score : " + score + "\n==========================";
	}
	
	
}
