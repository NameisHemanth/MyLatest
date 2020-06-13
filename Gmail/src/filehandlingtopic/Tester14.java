package filehandlingtopic;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Tester14
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/QspiderOnline/words.txt");
		try 
		{
			ArrayList<String> list = new ArrayList<String>();
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			while(data!=null)
			{
				list.add(data);
				data = br.readLine();
			}
			Collections.sort(list);
				
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String s:list)
			{
				bw.write(s);
				bw.newLine();
			}
			
			br.close();
			bw.close();
			System.out.println("File Updated...");
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
