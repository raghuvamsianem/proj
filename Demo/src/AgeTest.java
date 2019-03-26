import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class AgeTest {

	static Age a;
	@Before
	public void bef() {
		 a=new Age();
	}
	
	@Test
	public void test() {
	
	assertEquals("valid",a.ValidAge(19));
	}
	@Test
	public void test1() {
		assertEquals("cbn",a.ValidParty("tbp"));
	}
}
