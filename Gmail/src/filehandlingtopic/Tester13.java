package filehandlingtopic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Tester13
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/words.txt");
		try 
		{
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			while(data!=null)
			{
				System.out.println(data);
				data = br.readLine();
			}
			br.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
