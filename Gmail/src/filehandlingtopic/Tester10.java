package filehandlingtopic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Tester10
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/testing.txt");
		try
		{
			FileReader fr = new FileReader(f1);
			int a=fr.read();
			while(a!=-1)
			{
				System.out.print((char)a);
				a=fr.read();
			}
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
