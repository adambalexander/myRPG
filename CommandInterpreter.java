class CommandInterpreter{

	//Getters and Setters
	

	public void parseCommand(String commandString){
		String [] commandKeywords = commandString.split(" ");
		String [] commandVerbs = new String []{"go", "attack", "drop", "take", "wield", "equip", "use", "buy", "sell"};

		System.out.println("The parts of your command are:  ");
		for(String commandPart: commandKeywords){
			System.out.println(commandPart);
		}
	}
}