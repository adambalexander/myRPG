import java.util.HashMap;

class CommandInterpreter{


	public void parseCommand(String commandString){
		HashMap<String, String> commandVerbs;
		HashMap<String, String> commandDirections;

		commandVerbs = new HashMap<String, String>();
		commandVerbs.put("look", "look");
		commandVerbs.put("go", "move");
		commandVerbs.put("move", "move");
		commandVerbs.put("attack", "attack");
		commandVerbs.put("hit", "attack");
		commandVerbs.put("drop", "drop");
		commandVerbs.put("leave", "drop");
		commandVerbs.put("get", "take");
		commandVerbs.put("look", "look");

		String [] commandParts = commandString.split(" ");

		//String verbResult = "";

		if(commandVerbs.containsKey(commandParts[0]))
			System.out.println("Your true command is " + commandVerbs.get(commandParts[0]));
		else
			System.out.println("No verb was found in your command.");

	}
}