
public class Pokemon {
	private String Name;
	private int Speed;
	private int Defense;
	private int Hp;
	private Attack[] Attack;
	private int Damage;
	private int Energy;
	
	public void Pokemon(String Name, int Speed, int Defense, int Hp, Attack[] Attack) {
		this.Damage = 0;
		this.Energy = 0;
		
		if(!Name.equals(null) && Speed > 0 && Defense > 0 && Hp >0 && Damage >= 0 && Energy >= 0){
			this.Name = Name;
			this.Speed = Speed;
			this.Defense = Defense;
			this.Hp = Hp;
			this.Attack = Attack;
		} else throw new IllegalArgumentException();
	}
	
	public void Pokemon(String Name, Attack[] Attack) {
		Pokemon(Name, 50, 50, 50, Attack);
	}
	// class accessors
	public String getName() {
		return this.Name;	
	}
	
	public int getSpeed() {
		return this.Speed;
	}
	public int getDefense() {
		return this.Defense;
	}
	public int getHP() {
		return this.Hp;
	}
	public Attack[] getAttack(){
		return this.Attack;
	}
	public int getDamage() {
		return this.Damage;
	}
	public int getEnergy() {
		return this.Energy;
	}
	//class mutators
	public void setDamage(int newDamage) {
		if (newDamage >= 0) {
			this.Damage = newDamage;
		} else throw new IllegalArgumentException("Damage must be greater than or equal to zero.");
	}
	
	public void setEnergy(int newEnergy) {
		if(newEnergy == 0 || newEnergy + 1 == this.Energy || newEnergy -1 == this.Energy) {
			this.Energy = newEnergy;
		} else throw new IllegalArgumentException("Energy must equal zero or be 1 more/less than previous value.");
	}
}
