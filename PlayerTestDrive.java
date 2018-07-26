class PlayerTestDrive{

	public static void main(String[] args){
		Player p1 = new Player();
		p1.setName("Embalyst");
		p1.setStrength((byte)16);
		p1.setIntelligence((byte)14);
		p1.setWisdom((byte)15);
		p1.setDexterity((byte)12);
		p1.setConstitution((byte)13);
		p1.setCharisma((byte)9);

		System.out.println("Player's name is: " + p1.getName());
		System.out.println("Strength: " + p1.getStrength());
		System.out.println("Intelligence: " + p1.getIntelligence());
		System.out.println("Widsom: " + p1.getWisdom());
		System.out.println("Dexterity: " + p1.getDexterity());
		System.out.println("Constitution: " + p1.getConstitution());
		System.out.println("Charisma: " + p1.getCharisma());
	}
}