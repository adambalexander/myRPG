
class RoomTestDrive{
	public static void main(String [] args){
		Room currentRoom = new Room();
		Room Room1 = new Room();
		Room Room2 = new Room();

		Room1.setDescription("This is the first room.  Isn't it great?");
		Room1.setExit("south", Room2);
		Room2.setDescription("This is the second room that was created.  It's almost as nice as the first room!");
	
		currentRoom = Room1;
		System.out.println(currentRoom.getDescription());
		System.out.println("Let's try exiting south.");

		currentRoom = Room1.getExit("south");
		System.out.println(currentRoom.getDescription());
		//System.out.println("Let's try exiting south.");
	}
}