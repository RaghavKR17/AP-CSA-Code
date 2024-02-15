// Raghav K. Ranganathan
// 3/12/22
// APCS P5
// Dan Peterson

// stores info about entire order

import java.util.*;

public class ShoppingCart { // constructor: creates empty list for item orders
	double sum = 0;
	ArrayList <ItemOrder> cart;
	ArrayList <Item> catalog;
	boolean discount = false;
	public ShoppingCart() {
		cart = new ArrayList <ItemOrder>();
		catalog = new ArrayList <Item>(); 
	}
	public void add(ItemOrder order) { // adds item order to list, replace previous orders
		if (catalog.contains(order.getItem())) { 
			cart.set(catalog.indexOf(order.getItem()), order);
			sum -= order.getPrice();
		} else {
			cart.add(order);
			catalog.add(order.getItem());
		}
	}
	public void setDiscount(boolean a) { // sets boolean for discount
		if (a) {
			discount = true;
		}
		else 
			discount = false;
	}
	public double getTotal(){ // return total cost of order
		sum = 0;
		for (ItemOrder thing : cart) {
			sum += thing.getPrice();
		}
		if (discount) {
			return sum * 0.9;
		} else 
			return sum;
	}
}
