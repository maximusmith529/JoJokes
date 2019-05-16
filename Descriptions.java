
public class Descriptions {

	public Descriptions() {
	}

	
	
	public String Description(Character other) {
		String x ="" + Start() + GenderWord(other) + Height(other) + build(other);
		
		return x;
	}
	
	
	//Final Products
	public String CDescription(Character other) {
		String x = "";
		x = x.concat(Start());
		// There is 
		x = x.concat(GenderWord(other)+"");
		// There is a man/woman
		x = x.concat(Height(other));
		// There is a man/woman standing about x feet tall
		x = x.concat(build(other));
		// There is a man/woman standing about x feet tall.They have a(n) x build and are donned in *armor*
		x= x.concat(hands(other));
		
		return x;
	}
	
	public String CDescription(Character other, Character self) {
		String x = "";
		x = x.concat(Start());
		// There is 
		x = x.concat(GenderWord(other)+"");
		// There is a man/woman
		x = x.concat(Height(other));
		//There is a man/woman standing about x feet. 
		
		return x;
	}
	

	//Work Below
	
	
	public String Start() {
		String x = "";
		int r = (int) (Math.random() * 4);

		if (r == 0) {
			x = x.concat("Before you stands ");
		}
		 if (r == 1) {
			x = x.concat("In front of you is ");
		}
		 if (r == 2) {
			x = x.concat("ROLL INITIATIVE! ");
			Start(false);
		}
		 if (r == 3) {
			x = x.concat("You see ");
		}
		return x;
	}

	public String Start(boolean INI) {
		String x = "";
		int r = (int) (Math.random() * 4);

		if (r == 0) {
			x = x.concat("Before you stands ");
		}
		if (r == 1) {
			x = x.concat("In front of you is ");
		}
		if ((r == 2) && (INI != false)) {
			x = x.concat("ROLL INITIATIVE! ");
			Start(false);
		}
		if (r == 3) {
			x = x.concat("You see ");
		}
		return x;
	}

	public String GenderWord(Character ch1) {

		if (ch1.gender = true) {
			return "a man ";
		} else {
			return "a woman ";
		}
	}

	public String PossessivePronoun (Character ch1) {
		
		if(ch1.gender == true) {
			return "his ";
		} else {
			return "her ";
		}
	}
	
	public String Height(Character ch1, Character self) {
		String x = "";
		int r = (int) (Math.random() * 2);

		if (ch1.height > self.height + 1) {
			x = x.concat("towering over you at " + ch1.height + " feet tall. ");
		} else {

			if (r == 0) {
				x = x.concat("standing at about " + ch1.height + " feet. ");
			}
			if (r == 1) {
				x = x.concat("about " + ch1.height + " feet. ");
			}
		}

		return x;
	}

	public String Height(Character ch1) {
		String x = "";
		int r = (int) (Math.random() * 2);

		if (r == 0) {
			x = x.concat("standing at about " + ch1.height + " feet. ");
		}
		if (r == 1) {
			x = x.concat("about " + ch1.height + " feet. ");
		}
		return x;
	}
	
	//They're built *Word*
	//They have a *Word* build
	//They look *Word*

	
	public String build(Character ch1) {
		String x = "";
		int r = (int) (Math.random()*4);
		
		if (r == 0) {
			x = x.concat("They're built " +buildWord(ch1));
		}
		if (r == 1) {
			x = x.concat("They have a " +buildWord(ch1)+ "build ");
		}
		if (r == 2) {
			x = x.concat("They look " +buildWord(ch1));
		}
		if (r == 3) {
			x = x.concat("They seem " +buildWord(ch1));
		}
		
		if (ch1.Inventory.get(0).type == 0) {
			r = (int) (Math.random()*3);
			if (r == 0) {
				x = x.concat("and are wearing " +ch1.Inventory.get(0).name+ ". ");
			}
			if (r == 1) {
				x = x.concat("and they are donned in " +ch1.Inventory.get(0).name+ ". ");
			}
			if (r == 2) {
				x = x.concat("and they are dressed in " +ch1.Inventory.get(0).name + ". ");
			}
		}
		return x;
	}
	
	
	public String buildWord(Character ch1) {
		String x = "";
		if(ch1.strength < 9) {
			int r = (int) (Math.random()*5); //weak brittle fragile sickly feeble
			if (r == 0) {
				x = x.concat("weak ");
			}
			if (r == 1) {
				x = x.concat("brittle ");
			}
			if (r == 2) {
				x = x.concat("fragile ");
			}
			if (r == 3) {
				x = x.concat("sickly ");
			}
			if (r == 4) {
				x = x.concat("feeble ");
			}
		}
		if((9 <= ch1.strength)&&(ch1.strength < 14)) {
			int r = (int) (Math.random()*4); //fit normal trained slightly built
			if (r == 0) {
				x = x.concat("fit ");
			}
			if (r == 1) {
				x = x.concat("normal ");
			}
			if (r == 2) {
				x = x.concat("trained ");
			}
			if (r == 3) {
				x = x.concat("slightly built ");
			}
		}
		if(14 <= ch1.strength) {
			int r = (int) (Math.random()*4); //heavy set, heavy built, musclebound, brawny, burly
			if (r == 0) {
				x = x.concat("heavy set ");
			}
			if (r == 1) {
				x = x.concat("musclebound ");
			}
			if (r == 2) {
				x = x.concat("brawny ");
			}			
			if (r == 3) {
				x = x.concat("heavy-built ");
			}
			
		}
		
		return x;
	}
	// 0 = Armor : 1 = Left Hand : 2 = Right Hand: 3 = Necklace : 4 = Left Ring : 5 = Right Ring : >5 = Inventory
	public String hands(Character ch1) {
		String x = "";
		
		
			x = x.concat("In "+PossessivePronoun(ch1) +"right hand he wields a "+ch1.Inventory.get(2).name +" and in "+PossessivePronoun(ch1) +"left, a "
					+ch1.Inventory.get(1).name + ". " );
		
		
		
		return x;
	}
	
	
}
