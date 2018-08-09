class CommandInterpreter{

	//Getters and Setters
	

	public void parseCommand(String commandString){
		String [] commandKeywords = commandString.split(" ");

		for(String a: commandKeywords){
			System.out.println(a);
		}
	}
}