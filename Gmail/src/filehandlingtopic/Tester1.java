package filehandlingtopic;
import java.io.File;
public class Tester1
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\QspiderOnline");
		if(file.mkdir())
		{
			System.out.println("Folder is Created");
		}
		else
		{
			System.out.println("Folder is not Created");
		}
		if(file.exists())
		{
			System.out.println("Folder is Existing");
		}
		else
		{
			System.out.println("Folder is not Existing");
		}
		/*if(file.delete())
		{
			System.out.println("Folder is Delete");
		}
		else
		{
			System.out.println("Folder is not Delete");
		}*/
	}
}
