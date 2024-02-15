// Raghav K. Ranganathan
// 3/12/22
// APCS P5
// Dan Peterson

// collects items and stores info for groups of them

import java.util.*;

public class Catalog {
	private String name;
	private ArrayList<Item> itemList = new ArrayList<Item>(); //new array list for the items

	public Catalog(String name) { // constructor that takes the String name
		this.name = name;
	}
	
	public void add(Item item) { //  add items to end of list
		this.itemList.add(item);
	}
	
	public int size() { //return number of items in list
		return this.itemList.size();
	}
	
	public Item get(int index) { // gets index of item in list
		return this.itemList.get(index);
	}
	
	public String getName() { // gets name of catalog
		return this.name;
	}
}
