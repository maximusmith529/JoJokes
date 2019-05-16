
public class Enchantment {
	//Not limited to only enchantments, also potion effects, etc.
	
	public Enchantment(String name, boolean buff, boolean Static, int EType, int EAmount) {
		this.name = name;
		this.buff = buff;
		this.Static = Static;
		this.EType = EType;
		this.EAmount = EAmount;
	}
	public Enchantment(String name, boolean buff, boolean Static, int EType, int EAmount, int EStat) {
		this.name = name;
		this.buff = buff;
		this.Static = Static;
		this.EType = EType;
		this.EAmount = EAmount;
		this.EStat = EStat;
	}
	
	public Enchantment enchGenerator() {
		int r = (int)Math.random()*2;
		boolean b;
		boolean s;
		int EType = (int)Math.random()*7;
		int EAmount = (int) Math.random()*6;
		int EStat = (int) Math.random()*5;
		if(r == 0) {
			b = true;
		}else {
			b = false;
		}
		r = (int)Math.random()*2;
		if(r == 0) {
			s = true;
		}else {
			s = false;
		}
		String name = ""; //Descriptor
		Enchantment x = new Enchantment(name,b,s,EType,EAmount, EStat);
		return x;
	}
	
	
	
	
	String name;
	boolean buff; //Type of enchantment/buff/debuff 
	boolean Static; //If true enchantment is not an an over time effect ie. not healing over time/ poison over time
	int EType; //What statistics it affects. 0 == Armor? / Health : 1 == Mana : 2 == Stamina
			   // 3 == Stats (Strength, Agility, etc.) : 4 == Damage : 5 == Extra Life : 6 == Looting? 
	int EAmount;
	int EStat; /*	int strength = 8; 		0
					int agility = 8;  		1
					int dexterity = 8;		2
					int intelligence = 8;	3
					int constitution = 8;	4
					*/
	boolean PDmg;
	
	
	
	public void equipEnchantment(Character ch1) {
		if(Static == true) {
			if(EType == 0) {
				ch1.health =+ EAmount;
			}
			if(EType == 1) {
				ch1.mana =+ EAmount;
			}
			if(EType == 2) {
				ch1.stamina =+ EAmount;
			}
			if(EType == 3) {
				if(EStat == 0) {
					ch1.strength =+ EAmount;
				}
				if(EStat == 1) {
					ch1.agility =+ EAmount;
				}
				if(EStat == 2) {
					ch1.dexterity =+ EAmount;
				}
				if(EStat == 3) {
					ch1.intelligence =+ EAmount;
				}
				if(EStat == 4) {
					ch1.constitution =+ EAmount;
				}	
			}
			if(EType == 4) {
				if(PDmg == true) {
					ch1.pDamage =+ EAmount;
				}
				if(PDmg == false) {
					ch1.mDamage =+ EAmount;
				}
				
			}
			if(EType == 5) {
				ch1.extraLife =+ EAmount;
			}
			if(EType == 6) {
				ch1.luck =+ EAmount;
			}
			
			//Recalculate Statistics
			
		}
		
		
		
	}
	
	
	
}
