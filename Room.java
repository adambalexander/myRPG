import java.util.HashMap;

class Room{

private String _description;
private HashMap<String,Room> _exits;


	//Constructors

	Room(){
		_description = "";
		_exits = new HashMap<String,Room>();
	}

	//Getters and Setters
	
	public String getDescription(){
		return _description;
	}

	public void setDescription(String description){
		if(description.length() <= 250){
			_description = description;
		}
		else{
			_description = description.substring(0, 250);
		}	
	}

	public Room getExit(String exit){
		Room whichExit = _exits.get(exit);
		return whichExit;
	} 

	public void setExit(String exitName, Room exitRoom){
		_exits.put(exitName, exitRoom);
	}	
}

