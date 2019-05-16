
public class Main {
	
	/*Character Creation String name, String hair, String eyeColor, String skinColor, String other, int age, double height, int Class, int strength, int agility
    ,int dexterity, int intelligence, int constitution*/
	
	/*Item Creation 0 = Armor : 1 = Left Hand : 2 = Right Hand: 3 = Necklace : 4 = Left Ring : 5 = Right Ring : >5 = Inventory
	public Item(String name, String desc, int type)*/
	
	public static void main(String[] args) {
		
		Character DIO = new Character(true,"Dio", "Yellow", "Golden", "White", 23, 6.2, 1, 15, 15, 15, 9, 15);
		Item Mask = new Item("full plate-mail", "A strange mask, looks to be of Aztec origin", 0);
		DIO.AddItem(Mask);
		Character JOJO = new Character(true, "JOJO", "Black", "Brown", "Olive", 23, 6.2, 1, 15, 15, 15, 9, 15);
		Descriptions D = new Descriptions();
	
		System.out.println( D.CDescription(DIO));
	}
	
	
}
