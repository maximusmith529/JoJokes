
public class Consumable extends Item {

	int CType; // 0 = Healing : 1 = Buff : 2 = Damage
	int CAmount; //Amount of effect. EG. difference between Flask of Health and Greater Flask of Health
	
	
	
	public Consumable(String name, String desc) {
		super(name, desc, 6);
		// TODO Auto-generated constructor stub
	}
	
	public Consumable(String name, String desc, int rarity) {
		super(name, desc, 6, rarity);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
}
