import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AgeTests {
int input ;
String output;
public AgeTests(int input,String output) {
	this.input=input;
	this.output=output;
}
@Parameterized.Parameters
public static Collection<Object[]> m() {
	return Arrays.asList(new Object[][] {
		{18,"valid"},{12,"invalid"},{19,"invalid"}
		
	});
	
	
}
@Test
public void test() {
	Age a=new Age();
	assertEquals(output,a.ValidAge(input));
}
}
