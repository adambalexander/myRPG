
class RoomTestDrive{
	public static void main(String [] args){
		Room currentRoom = new Room();
		Room Room1 = new Room();
		Room Room2 = new Room();
		Room Room3 = new Room();

		Room1.setDescription("This is the first room.  Isn't it great?");
		Room1.setExit("south", Room2);
		Room1.setExit("east", Room3);

		Room2.setDescription("This is the second room that was created.  It's almost as nice as the first room!");
		Room2.setExit("north", Room1);

		Room3.setExit("west", Room1);
		Room3.setDescription("In this room is a small wooden table surrounded by chairs.  It looks as if someone may have eaten here not long ago.");

		currentRoom = Room1;
		System.out.println(currentRoom.getDescription());
		
		System.out.println("Let's try exiting south.");
		currentRoom = currentRoom.getExit("south");
		System.out.println(currentRoom.getDescription());

		System.out.println("Let's try going back north.");
		currentRoom = currentRoom.getExit("north");
		System.out.println(currentRoom.getDescription());

		System.out.println("Let's try exiting east.");
		currentRoom = currentRoom.getExit("east");
		System.out.println(currentRoom.getDescription());
		
	}
}