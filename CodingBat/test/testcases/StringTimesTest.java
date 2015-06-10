package testcases;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import examples.MonkeyTrouble;
import examples.StringTimes;
public class StringTimesTest {

	StringTimes stt;
	@Before
	public void setup() {
		stt = new StringTimes();
	}
	public void stringTest(String str,int n)
	{
	   String exp ="";
	   for(int i=0;i<n;i++)
	   {
		   exp =exp+str;
	   }
       String  actual=stt.stringTimes(str, n);
      if(actual.equals(exp))
      {
       System.out.println("given string is n times");
      }
      else
      {
    	  System.out.println("test case is failed");
      }
       Assert.assertEquals(actual, exp);
	}
	
	@Test
	public void stringTest1()
	{
		stringTest("abc",2);
		stringTest("xyz",3);

	}
	
}
