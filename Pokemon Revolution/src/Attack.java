public class Attack {
	//class
	private String Name;
	private int Energy;
	private int Value;
	
	//class constructors
	public void Attack(String Name, int Energy, int Value) {
		if(!(Name.equals(null)) && !(Name.equals("")) && Energy >= 1 && Energy <= 5 && Value != 0 && Math.abs(Value) <= (10 * Energy)) {
			this.Name = Name;
			this.Energy = Energy;
			this.Value = Value;
		}
	}
}
