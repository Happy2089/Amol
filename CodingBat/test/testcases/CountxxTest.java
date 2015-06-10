package testcases;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import examples.Countxx;

public class CountxxTest {
Countxx cx;

	@Before
	public void setup() {
		cx = new Countxx();
	}
	
	public void  count(String str)
	{
		 int cnt = 0;
		  for (int i = 0; i < str.length()-1; i++) {
		    if (str.substring(i, i+2).equals("xx")) cnt++;
		  }
		int actual=cx.countxx(str);
		int exp=cnt;
		if(actual==exp)
		{
			System.out.println("test success");
		}
		else
		{
			System.out.println("test failed");
		}
		Assert.assertEquals(actual,exp);
	}
	
	
	@Test
	public void count1()
	{
		count("xxx");
		count("xxxx");
	}
}
