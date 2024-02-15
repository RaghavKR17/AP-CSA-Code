// Raghav K. Ranganathan
// 3/12/22
// APCS P5
// Dan Peterson

// store info on each item
import java.text.*;

public class Item {
	String name;
	double price;
	int bulkquantity = 0;
	double bulkprice;
	public Item(String name, double price) { //constructorL: take in name and price, check for exception
		this.name = name;
		if (price < 0) {
			throw new IllegalArgumentException();
		} else {
			this.price = price;
		}
	}
	public Item (String name, double price, int bulkquantity, double bulkprice) {
		this.name = name;
		if (price < 0 || bulkprice < 0 || bulkquantity < 0) { //take in name and price and bulk quantity and bulk price, check for exception
			throw new IllegalArgumentException();
		} else {
			this.price = price;
			this.bulkquantity = bulkquantity;
 			this.bulkprice = bulkprice;
		}
	}
	public double priceFor(int quantity) { //take in quantity, return price
		if (quantity >= bulkquantity) {
			return (bulkprice + (quantity-bulkquantity)*price);
		}
		else {
			return (quantity * price);
		}
	}

	public String toString() { // format for bulk and regular price
		NumberFormat numfor = NumberFormat.getCurrencyInstance();
		if (bulkprice != 0) {
			return ((name + ", " + numfor.format(price) +  " (" + bulkquantity + " for $" + bulkprice + ")"));
		} else {
			return ((name + ", " + numfor.format(price)));
		}
	}
}