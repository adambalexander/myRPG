
class RoomTestDrive{
	public static void main(String [] args){
		Room currentRoom = new Room();
		Room Room1 = new Room();
		Room Room2 = new Room();

		Room1.setDescription("This is the first room.  Isn't it great?");
		Room1.setExit("south", Room2);
		Room2.setDescription("This is the second room that was created.  It's almost as nice as the first room!");
		Room2.setExit("north", Room1);
	
		currentRoom = Room1;
		System.out.println(currentRoom.getDescription());
		System.out.println("Let's try exiting south.");

		currentRoom = currentRoom.getExit("south");
		System.out.println(currentRoom.getDescription());
		System.out.println("Let's try going back north.");

		currentRoom = currentRoom.getExit("north");
		System.out.println(currentRoom.getDescription());
	}
}