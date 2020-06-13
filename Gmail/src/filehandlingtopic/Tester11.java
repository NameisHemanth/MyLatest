package filehandlingtopic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Tester11
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/testing.txt");
		try
		{
			FileReader fr = new FileReader(f1);
			char[] carr = new char[(int)f1.length()];
			fr.read(carr);
			String rv = new String(carr);
			System.out.println(rv);
			System.out.println(rv.toUpperCase());
			fr.close();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
