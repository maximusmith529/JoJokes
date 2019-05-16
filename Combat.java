
public class Combat {

	public Combat() {
		
	}
	
	public int calcDamage(Character Att, Character Def) {
		int DmgDone;
		if(Att.pDamage > Att.mDamage) {
			DmgDone = Att.pDamage - Def.armor;
		}else {
			DmgDone = Att.mDamage - Def.armor;
		}
		
		if(DmgDone < 0) {
			DmgDone = 0;
		}
		
		return DmgDone;
	}
	
	public void attack(Character Att, Character Def) {
		Def.sustainedDmg =+ calcDamage(Att, Def);
		
		if(Def.calcHP() < 0) {
			if(Def.extraLife <= 0) {
				//He ded Victory Condition
			}else {
				Def.extraLife =- 1;
			}
			
		}
	}
	
	
	
}
