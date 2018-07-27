class Player{

	private String _name;
	private byte _strength;
	private byte _intelligence;
	private byte _wisdom;
	private byte _dexterity;
	private byte _constitution;
	private byte _charisma;
	
	private byte _baseArmorClass;
	private int _maxHitPoints;
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

	public int getMaxHitPoints(){
		return _maxHitPoints;
	}

	public void setMaxHitPoints(int value){
		if(value < 1){
			_maxHitPoints = 1;
		}
		else{
			_maxHitPoints = value;
		}
	}
	
	public byte getBaseArmorClass(){
		return _baseArmorClass;
	}

	public void setBaseArmorClass(byte value){
		_baseArmorClass = value;
	}

	public byte getEffectiveArmorClass(){
		byte effectiveAC = _baseArmorClass;
		
		if(_dexterity >= 18){
			effectiveAC -= 3;
		}
		if(_dexterity <18 && _dexterity >= 15){
			effectiveAC -= 2;
		}
		if(_dexterity <15 && _dexterity >=13){
			effectiveAC -= 1;
		}
		
		return effectiveAC;
	}
	
	public int getHitPoints(){
		return _hitPoints;
	}

	public void setHitPoints(int value){
		if(value <= _maxHitPoints && value >= 0){
			_hitPoints = value;
		}
		if(value > _maxHitPoints){
			_hitPoints = _maxHitPoints;
		}
		if(value < 0){
			_hitPoints = 0;
		}
		
	}

	public void recoverHitPoints(int value){
		if(_hitPoints + value > _maxHitPoints){
			_hitPoints = _maxHitPoints;
		}
		else{
			_hitPoints = _hitPoints + value;
		}
	}
	
	public void takeDamage(int damage){
		if(_hitPoints > damage){
			_hitPoints = _hitPoints - damage;
		}
		else{
			_hitPoints = 0;
		}
	}
}