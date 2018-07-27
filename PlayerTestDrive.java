class PlayerTestDrive{

	public static void main(String[] args){
		Player p1 = new Player();
		p1.setName("Embalyst");
		p1.setStrength((byte)16);
		p1.setIntelligence((byte)14);
		p1.setWisdom((byte)15);
		p1.setDexterity((byte)16);
		p1.setConstitution((byte)13);
		p1.setCharisma((byte)9);

		System.out.println("Player's name is: " + p1.getName());
		System.out.println("Strength: " + p1.getStrength());
		System.out.println("Intelligence: " + p1.getIntelligence());
		System.out.println("Widsom: " + p1.getWisdom());
		System.out.println("Dexterity: " + p1.getDexterity());
		System.out.println("Constitution: " + p1.getConstitution());
		System.out.println("Charisma: " + p1.getCharisma());

		System.out.println("Setting maximum hit points to 20");
		p1.setMaxHitPoints(20);
		System.out.println("Max Hit Points: " + p1.getMaxHitPoints());
		System.out.println("Try to set hit points to higher than max");
		p1.setHitPoints(50);
		System.out.println("Hit Points: " + p1.getHitPoints());
		System.out.println("Setting Base AC...");
		p1.setBaseArmorClass((byte)9);
		System.out.println("Getting effective AC...");
		System.out.println("Effective AC: " + p1.getEffectiveArmorClass());
	}
}