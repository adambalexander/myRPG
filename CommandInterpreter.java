 class CommandInterpreter{


		 //Getters and Setters
	

	public void parseCommand(String commandString){
		String [] commandParts = commandString.split(" ");
		String [] commandVerbs = new String []{"go", "move", "attack", "drop", "take", "look"};
		String verbResult = "";
		//String object1;
		//String object2;

		//System.out.println("The parts of your command are:  ");
		for(String verb: commandVerbs) {
			if (verb.equals(commandParts[0]))
				verbResult = verb;
		}

		if(!verbResult.equals(""))
			System.out.println(commandParts[0] + " seems to be your command verb.");
		else
			System.out.println("No verb was found in your command.");




	}
}