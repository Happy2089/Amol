package testcases;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import examples.Sleep;
public class SleepinTestcase {

	Sleep sl;
	
	@Before
	public void setup(){
		sl = new Sleep ();
	
	}
	
	@Test
	public void  sleepIn(){
		boolean expected=true;
		boolean actual = sl.sleepIn(false,true);
		if(!actual|| expected)
		{
			
			System.out.println("If it is holiday "+actual);
		}
		Assert.assertEquals(actual, expected);
	}

		
}
