package filehandlingtopic;
import java.io.File;
import java.io.IOException;
public class Tester4
{
	public static void main(String[] args)
	{
		File f1 = new File("testing.txt");
		try 
		{
			if(f1.createNewFile())
			{
				System.out.println("File is Created");
			}
			else
			{
				System.out.println("File is not Created");
			}
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
