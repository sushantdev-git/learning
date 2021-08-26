package ice_cream_parlour;

public class Main {
	
	public static void main(String args[]) {
		
		Shop1 s1 = new Shop1();
		Shop2 s2 = new Shop2();
		
		s1.addFlavour();
		s1.addsplFlavour();
		
		s1.Buy();
		s2.Buy();
		
	}
}
/*
	Chocolate 100
	Vanilla 80
	Strawberry 80
	Mint_chocolatechip 60
	Butter_scotch 60
	Chocolate_chip  70
	Cherry 50
	Pistachio 70
	Milk 50
	Blue_berry 60
	
	
	Cookie_dough 80
	Buttered_Pecan 70
	Coffee 80
	Whipped_Cream 90
	Mix 120
*/