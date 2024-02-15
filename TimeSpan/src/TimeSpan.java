//Raghav K. Ranganathan
//APCS P5
//TimeSpan Programming Lab
//1/20/22

// The program takes given time from test file and converts to hours. returns in a string with pre-designed format.
	public class TimeSpan {
	// Defines variable hrs and mins
	private int hrs;
	private int mins;
	
	//Constructor
	public TimeSpan(int hrs,int mins) {
		this.hrs = hrs;
		this.mins = mins;
	}
	// Checks if minute in time is more than 60 and fixes accordingly. 
	public void checkandchange() {
		if (this.mins >= 60) {
			this.hrs += this.mins/60;
			this.mins = this.mins % 60;
		}
	}
	// returns the time as a formatted string
	public String toString() {
		checkandchange();
		return (this.hrs + "h" + this.mins + "m");
	}
	// add time to timespan state
	public void add(int hrs, int mins) {
		this.hrs += hrs;
		this.mins += mins;
		checkandchange();
	}
	// add another timespan to current one.
	public void add(TimeSpan t2) {
		this.hrs += t2.hrs;
		this.mins += t2.mins;
		checkandchange();
	}
	// return total number of hours as a float.
	public double getTotalHours() {
		checkandchange();
		return (this.hrs + (this.mins / 60.0));
		}
}