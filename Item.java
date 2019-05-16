
public class Item {

	String name;
	String desc;
	int type; // 0 = Armor : 1 = Left Hand : 2 = Right Hand: 3 = Necklace : 4 = Left Ring : 5 = Right Ring : >5 = Inventory
	int rarity;
	Enchantment Ench;
	boolean equipped;
	

	
	
	public Item(String name, String desc, int type) {
		
		this.name = name;
		this.desc = desc;
		this.type = type;
		
	}
	
	public Item(String name, String desc, int type, int rarity) {
		
		this.name = name;
		this.desc = desc;
		this.rarity = rarity;
		this.type = type;
	}

	//Add enchantments after item creation

	public void addEnchantment (Enchantment Ench) {
		this.Ench = Ench;
	}
	
		//public Enchantment(String name, boolean buff, boolean Static, int EType, int EAmount, int EStat) {
	
	public Item unequip (Item x) {
		x.equipped = false;
		return x;
	}
	
	public Item equip(Item x) {
		x.equipped = true;
		return x;
	}
	
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", desc=" + desc + ", type=" + type + ", rarity=" + rarity + "]";
	}
	
	
	
}
