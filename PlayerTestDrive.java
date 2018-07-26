class PlayerTestDrive{

	public static void main(String[] args){
		Player p1 = new Player();
		p1.setName("Embalyst");
		p1.setStrength((byte)16);
		p1.setIntelligence((byte)14);

		System.out.println("Player's name is: " + p1.getName());
		System.out.println("Strength: " + p1.getStrength());
		System.out.println("Intelligence: " + p1.getIntelligence());
	}
}