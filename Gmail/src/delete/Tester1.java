package delete;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class Tester1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);
		
		ArrayList<String> list = new ArrayList<String>(wids);
		Collections.reverse(list);
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		
		/*for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}*/		
		
		/*System.out.println(wids.size());
		System.out.println(wids);
		
		Iterator itr = wids.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
	}
}
