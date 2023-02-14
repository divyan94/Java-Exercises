package Serialization1;
import java.io.*;
public class Ball implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	public String ballname;
	public transient int Size;
	transient static int i = 10;
	transient final double Price = 2.0;
	
}

