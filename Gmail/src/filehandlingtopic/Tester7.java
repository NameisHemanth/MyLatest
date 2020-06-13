package filehandlingtopic;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Tester7
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/development.txt");
		try 
		{
			FileWriter fw = new FileWriter(f1, true);
			fw.write("Hello, Welcome to Qspiders");
			fw.close();
			System.out.println("DONE!!");
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}

