import java.io.*;
import java.util.*;

public class LetterConversion
{
	public static void main(String args [])
	{
		// Print out numbers and their corresponding letters 
		for(int i = 0; i < 26; i++)
			System.out.println("Number " + i + " corresponds to letter " + ConvertToLetter(i));
	}
	
	// Convert number to corresponding letter (a = 0... z = 25)
    public static char ConvertToLetter(int num)
    {
        // Remember a = 97
        int adjustedNum = num + 97;
		
		// Cast adjusted number to a character and return 
        return (char)adjustedNum;
    }
}