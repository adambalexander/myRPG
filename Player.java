class Player{

	private String _name;
	private byte _strength;
	private byte _intelligence;
	private byte _wisdom;
	private byte _dexterity;
	private byte _constitution;
	private byte _charisma;
	
	private int _hitPoints;
	private int _magicPoints;
	private int _encumberance;
	
	
	//Getters and Setters
	public String getName(){
		return _name;
	}	

	public void setName(String name){
	_name = name;}

	public byte getStrength(){
		return _strength;
	}

	public void setStrength(byte strength){
		_strength = strength;
	}

	public byte getIntelligence(){
		return _intelligence;
	}

	public void setIntelligence(byte intelligence){
		_intelligence = intelligence;
	}

	public byte getWisdom(){
		return _wisdom;
	}

	public void setWisdom(byte wisdom){
		_wisdom = wisdom;
	}
	
	public byte getDexterity(){
		return _dexterity;
	}

	public void setDexterity(byte dexterity){
		_dexterity = dexterity;
	}

	public byte getConstitution(){
		return _constitution;
	}

	public void setConstitution(byte constitution){
		_constitution = constitution;
	}

	public byte getCharisma(){
		return _charisma;
	}

	public void setCharisma(byte charisma){
		_charisma = charisma;
	}
}