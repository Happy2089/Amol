package examples;

public class Sleep {
    boolean weekday;
    boolean vacation;
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) 
		{
		    return true;
		}
		return false;
	}
}

