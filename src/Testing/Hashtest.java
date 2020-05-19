package Testing;

import data_structures.Hash;
public class Hashtest {
	public static void main(String args[]){
		Hash<String,Integer> table = new Hash<String,Integer>(16);
		table.add("one", 1);
		table.add("two", 2);
		table.add("three", 3);
		table.add("four", 4);
		table.add("FIVE", 5);
		System.out.println(table.getValue("one"));
		System.out.println(table.getValue("two"));
		System.out.println(table.getValue("three"));
		System.out.println(table.getValue("four"));
		System.out.println(table.getValue("five"));
		System.out.println(table.remove("four"));
		System.out.println(table.contains("five"));
		
		System.out.println(table.isEmpty());
		
		String s = "s";
		
		for(int i = 2; i < 20; i++) {
			s = s + "s";
			table.add(s,i);
		}
		System.out.println(table.isEmpty());
		s = "s";
		
		for(int i = 2; i < 20; i++) {
			s = s + "s";
			System.out.println(table.getValue(s));
		}
		
		table.changeValue("sssss",17);
		s = "s";
		
		for(int i = 2; i < 20; i++) {
			s = s + "s";
			System.out.println(table.getValue(s));
		}
		s = "s";
		for(int i = 2; i < 20; i++) {
			s = s + "s";
			table.remove(s);
		}
		System.out.println(table.isEmpty());
		table.remove("one");
		table.remove("two");
		table.remove("three");
		table.remove("four");
		table.remove("FIVE");
		System.out.println(table.isEmpty());
		
		
		
	}
	
}
