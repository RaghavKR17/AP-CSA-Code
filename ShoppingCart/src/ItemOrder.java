// Raghav K. Ranganathan
// 3/12/22
// APCS P5
// Dan Peterson

// store info on specific item and quantity for the item

public class ItemOrder { 
	private Item item;
	private int quantity;
	private double price;

	public ItemOrder(Item item, int quantity) { // constructor: takes item and quantity, calculates price
		this.item = item;
		this.quantity = quantity;
		this.price = item.priceFor(quantity);
	}

	public double getPrice() { // return price
		return this.price;
	}

	public Item getItem() { // returns item
		return this.item;
	}
}
