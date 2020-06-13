package collectionstopic;

import java.util.ArrayList;

public class Tester12
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("Einstein");
		list.add("Charles");
		list.add("Dennis");
		System.out.println(list);
		
		String s=(String)list.get(0);
		System.out.println(s.toUpperCase());
		
		String s2=(String)list.get(1);
		System.out.println(s2.toLowerCase());
		
		String s3=(String)list.get(2);
		System.out.println(s3.charAt(0));
	}
}
