import java.io.*;
import java.util.*;

public class RunLengthEncoding 
{

	public static void main(String args[]) throws Exception
	{
		String str = new String(); // String variable to hold the value of the string to be encoded.
		String rlestr = new String(); // String variable to hold the final RLE encoded string.
		Integer rlecount = 1, totalcount = 1; // The integers holding the RLE values and the value of the currently under analysis string variable.
		String ch = new String(); // Holds the value of the character in the run.

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		System.out.println(“Enter the String to be converted to RLE Format:\n”);
		str = br.readLine();
		for (int i = 0; i < str.length() – 1; i++) 
		{

			ch = Character.toString(str.charAt(i));
			if( str.charAt(i) == str.charAt(i+1) ) // Checks whether two consecutive letters are equivalent, hereby creating a run.
			{
				rlecount++;
				totalcount++;
			}
			if ( !Character.toString(str.charAt(i+1)).equalsIgnoreCase(ch) ) // Checks when the end of the run occurs and appends to the output string.
			{
				rlestr = rlestr + ch;
				rlestr = rlestr + rlecount.toString();
				rlecount = 1;
				totalcount++;
			}
		
			if ( i == str.length() – 2 ) // When the end of the input string approaches, it performs the final append operation and breaks out of the loop.
			{
				ch = Character.toString(str.charAt(i+1));
				rlestr = rlestr + ch;
				rlestr = rlestr + rlecount.toString();
				break;
			}
		}
		System.out.println(“The RLE encoded String is:”);
		System.out.println(rlestr);
	}
}