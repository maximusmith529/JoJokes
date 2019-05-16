
public class Armor extends Item {

	int AType; //0 == Cloth : 1 == Medium : 2 == Heavy
	int AValue; //Amount of armor provided.
	
	public int getArmor() {
		return AValue;
	}
	
	public Armor(String name, String desc, int type, int rarity) {
		super(name, desc, 0, rarity);
		// TODO Auto-generated constructor stub
	}
	public Armor(String name, String desc, int type) {
		super(name, desc, 0);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
