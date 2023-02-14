package Serialization1;

import java.io.*;
public class BallDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Ball b = new Ball();
		b.ballname = "Soccer";
		b.Size = 20;
		
		FileOutputStream fos = new FileOutputStream("ball.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ball.ser"));
		Ball b2 = (Ball) ois.readObject();
		System.out.println("Ball name: " + b.ballname + b.Size);
		System.out.println("Ball2 name: " + b2.ballname + b2.Size);
	}

}
