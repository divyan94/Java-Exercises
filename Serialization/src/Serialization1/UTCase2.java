package Serialization1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UTCase2 {
	Dog d1, d2;
	
	@BeforeEach
	void setUp() throws Exception {
		d1 = new Dog();
		d2 = new Dog("Divya", "aqua", "pug", 25);
	}

	@AfterEach
	void tearDown() throws Exception {
		d1 = null;
		d2 = null;
	}

	@Test
	void test() {
		d1.bark(2);
		d1.play(3);
		assertEquals(5, d1.getAge(), "Error message");
	}

}
