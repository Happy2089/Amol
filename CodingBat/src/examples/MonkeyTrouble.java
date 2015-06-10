package examples;

public class MonkeyTrouble {

	
	public boolean monkeyTrouble(boolean aSmiles,boolean bSmiles)
	{
		if(aSmiles && bSmiles || !aSmiles && !bSmiles )
		{
			return true;
		}
		return false;
		
	}
}
