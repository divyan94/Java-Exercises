package Serialization1;

import java.io.*;

public class MultipleClass2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Do d1 = new Do();
		FileOutputStream fos = new FileOutputStream("Myclass1.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("Myclass1.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Do d2 = (Do)ois.readObject();
		System.out.println("Do Object: " + d2.dog1);
		System.out.println("Rat Object: " + d2.r.rat1);
		System.out.println("Cat Obejct: " + d2.r.c.cat1);
		System.out.println(d2.r.c.d);
	}

}

class Do implements Serializable{
	int dog1 = 1;
	Ra r = new Ra();
}

class Ra implements Serializable{
	int rat1 = 2;
	Ca c = new Ca();
}

class Ca implements Serializable{
	String cat1 = "I am Cat";
	int d = 20;
}
