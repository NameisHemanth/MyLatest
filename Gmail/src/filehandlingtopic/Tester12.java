package filehandlingtopic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Tester12
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/words.txt");
		try 
		{
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Elephant");
			bw.newLine();
			bw.write("Doll");
			bw.newLine();
			bw.write("Cat");
			bw.newLine();
			bw.write("Ball");
			bw.newLine();
			bw.write("Apple");
			bw.close();
			System.out.println("Done!!");
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
