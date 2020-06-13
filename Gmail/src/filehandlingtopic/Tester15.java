package filehandlingtopic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Tester15
{
	public static void main(String[] args) 
	{
		File f1 = new File("C:\\Users\\Hp\\Downloads\\Girish_Sir.jpg");
		try
		{
			FileInputStream fin = new FileInputStream(f1);
			byte[] barr = new byte[(int)f1.length()];
			fin.read(barr);
			
			FileOutputStream fout = new FileOutputStream("E:\\177\\Session 39\\CEO.jpg");
			fout.write(barr);
			
			fout.close();
			fin.close();
			System.out.println("DOne!!");
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
