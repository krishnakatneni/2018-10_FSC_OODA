package HW2.test.edu.fitchburgstate.csc7400;

/**
 * JUnit Test cases for GuitarType class  
 * @author snemani,vkatneni
 * @version 2.0
 */


public enum GuitarType {
	Electric, Acoustic;
	public String toString()
	{
		switch(this)
		{
		case Electric:
			return "Electric";
		case Acoustic:
			return "Acoustic";
		default: throw new IllegalArgumentException();
		
		}
	}

}
