package filehandlingtopic;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Tester5
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/testing.txt");
		try 
		{
			FileWriter fw = new FileWriter(f1);
			fw.write("Hello, Welcome to Skillrary");
			fw.close();
			System.out.println("DONE!!");
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}

