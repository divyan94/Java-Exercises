package Serialization1;
import java.io.*;
public class MultipleClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Sheep s1 = new Sheep();
		Rat r1 = new Rat();
		Cat c1 = new Cat();
		Mouse m1 = new Mouse();
		
		s1.setName("My Sheep");
		r1.setName("My rat");
		c1.setName("My cat");
		m1.setName("My mouse");
		Sheep s2;
		Rat r2;
		Cat c2;
		Mouse m2;
		FileOutputStream fos = new FileOutputStream("Myclass.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(r1);
		oos.writeObject(c1);
		oos.writeObject(m1);
		FileInputStream fis = new FileInputStream("Myclass.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		if(o instanceof Sheep) {
			s2 = (Sheep)o;
			System.out.println("Sheep : " + s2.getName());
			
		} else if(o instanceof Rat) {
			r2 = (Rat)o;
			System.out.println("Rat : " + r2.getName());
			
		} else if(o instanceof Cat) {
			c2 = (Cat)o;
			System.out.println("Cat : " + c2.getName());
			
		} else {
			 m2 = (Mouse)o;
			 System.out.println("Mouse : " + m2.getName());
				
		}
		//Sheep s2 = (Sheep) ois.readObject();
		//Rat r2 = (Rat) ois.readObject();
		//Cat c2 = (Cat) ois.readObject();
		//Mouse m2 = (Mouse) ois.readObject();
		
	}

}

class Sheep implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Rat implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Mouse implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Cat implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
