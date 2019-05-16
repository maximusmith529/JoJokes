import java.util.ArrayList;

public class Character {

	boolean gender = true; //true == Male
	String name = "DIO";
	String hair = "GOLDEN";
	String eyeColor = "GOLDEN";
	String skinColor = "GOLDEN";
	String other;
	
	int age = 300;
	double height = 6.8; //Feet
	
	// 0 = Warrior : 1 = Wizard : 2 = Rogue : 3 = No Class
	int Class = 3;
	
	
	// Stats for character
	int strength = 8;
	int agility = 8;
	int dexterity = 8;
	int intelligence = 8;
	int constitution = 8;
	
	// Dependent Stats
	int health;
	int mana;
	int stamina;
	
	int armor;
	
	int attackSpeed;
	int pDamage;
	int mDamage;
	int luck;
	

	//Adjusted Dependent Stats
	// 0 = Str : 1 = Agi : 2 = Dext : 3 = Int : 4 = Const : 5 = AttSpeed : 6 = PDmg : 7 = MDmg : 8 = Armor : 9 = Lives : 10 = Luck
	int AdjStrength;
	int AdjAgility;
	int AdjDexterity;
	int AdjIntelligence;
	int AdjConstitution;
	
	int AdjAttackSpeed;
	int AdjPDamage;
	int AdjMDamage;
	int AdjArmor;
	
	int AdjHealth;
	int AdjMana;
	int AdjStamina;
	
	int extraLife = 0;
	int adjLuck;
	
	int sustainedDmg = 0;
	int HP;
	
	public void setBaseDStats() {
		this.health = calcBaseHealth();
		this.mana = calcBaseMana();
		this.stamina = calcBaseStamina();
		this.pDamage = calcBasePDamage();
		this.mDamage = calcBaseMDamage();
		this.attackSpeed = calcBaseAttackSpeed();
	}
	
	
	public int calcBaseHealth() {
		int x;
		x = 4 + (int) ((this.constitution+1)/2);
		return x;
	}
	public int calcBaseMana() {
		int x;
		x = this.intelligence/2;
		
		return x;
	}
	public int calcBaseStamina() {
		int x = 0;
		x = (int)(strength/4) + (dexterity/3);	
		return x;
	}
	public int calcBasePDamage() {
		int x = 0;
		x = (this.strength/4);
		return x;
	}
	public int calcBaseAttackSpeed() {
		int x = 0;
		x = 8 + (dexterity/2) + (agility/2);
		return x;
	}
	public int calcBaseMDamage() {
		int x = 0;
		x = (this.intelligence/4);
		return x;
	}
	// 0 = Str : 1 = Agi : 2 = Dext : 3 = Int : 4 = Const 
	// 5 = AttSpeed : 6 = PDmg : 7 = MDmg : 8 = Armor : 9 = Lives : 10 = Luck
	public int calcAdjStrength() {
		int x = strength;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.EType == 3)&&(Equipped.get(i).Ench.EStat == 0)) {
				x =+ Equipped.get(i).Ench.EAmount;
			}
		
		}
		
		return x;
	}
	public int calcAdjAgility() {
		int x = agility;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.EType == 3)&&(Equipped.get(i).Ench.EStat == 1)) {
				x =+ Equipped.get(i).Ench.EAmount;
			}
		
		}
		
		return x;
	}
	
	public int calcAdjDexterity() {
		int x = agility;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.EType == 3)&&(Equipped.get(i).Ench.EStat == 2)) {
				x =+ Equipped.get(i).Ench.EAmount;
			}
		
		}
		
		return x;
	}
	
	public int calcAdjIntelligence() {
		int x = agility;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.EType == 3)&&(Equipped.get(i).Ench.EStat == 3)) {
				x =+ Equipped.get(i).Ench.EAmount;
			}
		
		}
		
		return x;
	}
	
	public int calcAdjConstitution() {
		int x = agility;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.EType == 3)&&(Equipped.get(i).Ench.EStat == 4)) {
				x =+ Equipped.get(i).Ench.EAmount;
			}
		
		}
		
		return x;
	} 
	
	public int calcAdjMDamage() {
		int x = 0;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.PDmg == false)&&(Equipped.get(i).Ench.EType == 4)) {
				x =+ Equipped.get(i).Ench.EAmount;
		
			}
		}
		return x;
	}
	
	public int calcAdjPDamage() {
		int x = pDamage;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if((Equipped.get(i).Ench.PDmg == true)&&(Equipped.get(i).Ench.EType == 4)) {
				x =+ Equipped.get(i).Ench.EAmount;
		
			}
		}
		return x;
	}
	
	public int calcExtraLife() {
		int x = extraLife;
		
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 5) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		
		return x;
	}
	
	public int calcAdjLuck() {
		int x = luck;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 6) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		return x;
	}
	
	public int calcAdjAttackSpeed() {
		int x = attackSpeed;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 8) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		return x;
	}
	
	public int calcAdjArmor() {
		int x = armor;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 7) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		
		return x;
		
	}
	
	public int calcAdjHealth() {
		int x = health;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 0) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		return x;
			
	}
	
	public int calcAdjMana() {
		
		int x = health;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 1) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		return x;
			
	}
	
	public int calcAdjStamina() {
		int x = health;
		for(int i = 0; i < Equipped.size(); i++) {
			
			if(Equipped.get(i).Ench.EType == 2) {
				x =+ Equipped.get(i).Ench.EAmount;
				
			}
		}
		return x;
			
	}
	
	public int calcHP() {
		calcAdjHealth();
		int x = AdjHealth;
		
		x =- sustainedDmg;
		
		
		return x;
	}

	ArrayList<Item> Inventory = new ArrayList<Item>(); // 0 = Armor : 1 = Left Hand : 2 = Right Hand: 3 = Necklace : 4 = Left Ring : 5 = Right Ring : >5 = Inventory
	ArrayList<Item> Equipped = new ArrayList<Item>();
	
	public void ResetInventory( ) { //And Reset new OwO
		Inventory.ensureCapacity(5);
		
		for(int x = 0; x < 6; x++ ) {
		Item Nothing = new Item ("nothing","nothing", x);
		Inventory.add(x,Nothing);
		}
	}
	
	public void updateEquipped() {
		Equipped.clear();
		Equipped.addAll(checkEquipped());
	}
	
	public void UseItem(Item x) {
		if(x.type < 6) {
			EquipItem(x);
		}
		else {
			// Do item stuff
		}
	}
	
	public void AddItem(Item x) {
		Inventory.add(x);
	}
	
	public void EquipItem(Item x ) { //Will I ever use this?
		
		if (x.type < 6) {
			for (int i = 0 ; i < 6; i++) {
				if(x.type == i) {
					Inventory.set(i, Inventory.get(i).unequip(Inventory.get(i)));
					Inventory.add(Inventory.get(i));
					
					Inventory.set(i, x.equip(x));
				}
			}
		}
		else {
			
			double random =  Math.random();
			if ((.10 < random) && (random <= .40)  ) {
				System.out.println("What're you trying to do with that?");
			}
			if ((.40 < random) && (random <= 1)) {
				System.out.println("That's not an equippable item!");
			}
			if (random <= .10) {
				System.out.println("Try again, maybe it'll work next time.");
			}
		}
	}
	
	public ArrayList<Item> checkEquipped () {
		ArrayList<Item> Equipped = new ArrayList <>();
		
		for(int i = 0; i < Inventory.size(); i++) {
			if(Inventory.get(i).equipped == true) {
				Equipped.add(Inventory.get(i));
			}
		}
		
		return Equipped;
	}
	
	// 0 = Str : 1 = Agi : 2 = Dext : 3 = Int : 4 = Const 
	// 5 = AttSpeed : 6 = PDmg : 7 = MDmg : 8 = Armor : 9 = Lives : 10 = Luck
	

	
	public int[] calcAdjusted() {
		int[] adj = new int [11];
		
		
		
		return adj;
	}
	
	public Character() {
		
	}
	
	//With other description
	public Character(boolean gender, String name, String hair, String eyeColor, String skinColor, String other, int age, double height, int Class, int strength, int agility
			         ,int dexterity, int intelligence, int constitution) {
		this.gender = gender;
		this.name = name;
		this.hair = hair;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.other = other;
		
		this.age = age;
		this.height = height;
		
		this.Class = Class;
		
		this.strength = strength;
		this.agility = agility;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.constitution = constitution;
		
		ResetInventory();
		
	}
	
	//Without other description
	public Character(boolean gender, String name, String hair, String eyeColor, String skinColor, int age, double height, int Class, int strength, int agility
					,int dexterity, int intelligence, int constitution) {
		this.gender = gender;
		this.name = name;
		this.hair = hair;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		
		this.age = age;
		this.height = height;
		
		this.Class = Class;
		
		this.strength = strength;
		this.agility = agility;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.constitution = constitution;
		
		ResetInventory();
	}	
	
	
	//Without other description default stats and class
	public Character(boolean gender, String name, String hair, String eyeColor, String skinColor, String other, int age, double height) {
		this.gender = gender;
		this.name = name;
		this.hair = hair;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.other = other;
		
		this.age = age;
		this.height = height;
		
		ResetInventory();
	}
	
	//With other description default stats and class
	public Character(boolean gender, String name, String hair, String eyeColor, String skinColor, int age, double height) {
		this.gender = gender;
		this.name = name;
		this.hair = hair;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		
		this.age = age;
		this.height = height;
		
		ResetInventory();
		
	}
	
	public Character(boolean gender, String name, String hair, String eyeColor, String skinColor) {
		this.gender = gender;
		this.name = name;
		this.hair = hair;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		

		
		ResetInventory();
		
	}

	
	//DESCRIPTION CODE

	

	
	@Override
	public String toString() {
		return "Character [name=" + name + ", hair=" + hair + ", eyeColor=" + eyeColor + ", skinColor=" + skinColor
				+ ", other=" + other + ", age=" + age + ", height=" + height + ", Class=" + Class + ", strength="
				+ strength + ", agility=" + agility + ", dexterity=" + dexterity + ", intelligence=" + intelligence
				+ ", constitution=" + constitution + ", extraLife=" + extraLife + ", Inventory=" + Inventory + "]";
	}

}
