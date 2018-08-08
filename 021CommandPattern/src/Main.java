import java.util.LinkedList;
import java.util.Queue;

import Command.Command;
import Command.CreateCommand;
import Command.DeleteCommand;
import Command.UpdateCommand;

public class Main {
	public static void main(String[] args) {
		Queue<Command> queue = new LinkedList<>();
		queue.add(new DeleteCommand());
		queue.add(new CreateCommand());
		queue.add(new UpdateCommand());
		
		
		for(Command command : queue) {
			command.execute();
		}
	}
}
