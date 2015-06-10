package testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import examples.MonkeyTrouble;

public class MonkeyTest {

	MonkeyTrouble mt;
	static int cnt;
	static int errs;

	@Before
	public void setup() {
		mt = new MonkeyTrouble();
	}

	/*
	 * if(actual==trouble) {
	 * 
	 * System.out.println("monkey is  noughty "+actual); } else {
	 * System.out.println("monkey  is good"); } Assert.assertEquals(actual,
	 * trouble);
	 */

	public void monkeyTrouble1(boolean expected, boolean aSmiles,
			boolean bSmiles) {
		boolean actual = mt.monkeyTrouble(aSmiles, bSmiles);
		cnt++;
		if (!actual == expected) {
			errs++;
			System.out.println("Actual :" + actual + ", expected :" + expected
					+ ", for aSmiles  :" + aSmiles + ", bSm :" + bSmiles + ".");
		}
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void monkeyTrouble() {

		monkeyTrouble1(true, false, false);
		monkeyTrouble1(true, true, true);
		monkeyTrouble1(false, true, false);
		monkeyTrouble1(false, false, true);
		System.out.println("Cnt " + cnt + " err " + errs);

	}

}
