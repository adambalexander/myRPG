import java.io.BufferedReader;
import java.io.InputStreamReader;

class CommandInterpreterTestDrive{
public static void main(String [] args){
	CommandInterpreter cmdi = new CommandInterpreter();
	String s = "";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
	s = br.readLine();
	}
	catch(Exception ioex){
		System.out.println("Exception Caught");
	}
	cmdi.parseCommand(s);
}
}