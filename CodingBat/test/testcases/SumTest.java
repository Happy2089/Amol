package testcases;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import examples.Sum;
public class SumTest {
		
	Sum mt;
	int sum,equal;
	@Before
		public void setup(){
			mt = new Sum ();
		}
		
		public void  sumDouble1(int n1,int n2){
			int double1=n1*2;
			int actual = mt.sumDouble(n1,n2);
			if(actual==double1)
			{
				equal++;
				System.out.println("no is equal "+actual);
			}
			else
			{
				System.out.println("no   is not equal "+actual);
				sum++;
			}
			Assert.assertEquals(actual,double1);
		}
		
		@Test
		public void sumTest()
		{
			sumDouble1(1,2);
			sumDouble1(1,1);
			sumDouble1(1,3);
			System.out.println("sum"+ sum +"equal" + equal);
			
		}
	}
	
