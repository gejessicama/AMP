
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Tests {
	
	private AMPDb amp;
	
	@Test
	public void test0() {
		
		//testing whether the reciprocal removal thing works
		try {
			amp = new AMPDb("data/reciprocaltest.json");
			assertEquals(amp.getMap().size(),7);
			
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
			e.printStackTrace();
		}
	}
}
