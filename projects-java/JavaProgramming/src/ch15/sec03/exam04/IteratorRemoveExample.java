package ch15.sec03.exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Jsp");
		list.add("C");
		list.add("D");
		list.add("E");
		
		/*
		for(String item : list) { 
			if(item.equals("C")) { 
				list.remove(item); 
			} 
		}
		*/
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if(item.equals("Jsp")) {
				iterator.remove();
			}
		}
		 
		
		for(String s : list) {
			System.out.print(s + " ");
		}
		/*
		System.out.println();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		*/
	}

}
