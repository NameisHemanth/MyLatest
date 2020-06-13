package collectionstopic;

import java.util.ArrayList;
import java.util.List;
class WebElement
{
	public String getText()
	{
		return "linkText";
	}
}
public class Tester13
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Einstein");
		list.add("Charles");
		list.add("Dennis");
//		list.add(10);
		System.out.println(list.get(0).toUpperCase());
		System.out.println(list.get(1).toLowerCase());
		System.out.println(list.get(2).charAt(0));
		
		ArrayList<WebElement> list2 = new ArrayList<WebElement>();
		list2.add(new WebElement());
		list2.add(new WebElement());
		
		System.out.println(list2.get(0).getText());
		System.out.println(list2.get(1).getText());
		
		System.out.println("===============================");
		
		List<WebElement> list3 = new ArrayList<WebElement>();
		list3.add(new WebElement());
		list3.add(new WebElement());
		
		System.out.println(list3.get(0).getText());
		System.out.println(list3.get(1).getText());
		
	}
}
