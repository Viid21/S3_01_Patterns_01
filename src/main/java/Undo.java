import java.util.Stack;

public class Undo {
    private static Undo instance;
    private Stack<String> commands;

    private Undo() {
        commands = new Stack<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commands.push(command);
    }


    public String undoCommand() {
        if (!commands.isEmpty()) {
            return commands.pop();
        }
        return null;
    }

    public void showHistory() {
        if (commands.isEmpty()) {
            System.out.println("History empty.");
        } else {
            for (String cmd : commands) {
                System.out.println(cmd);
            }
        }
    }

    public Stack<String> getCommands() {
        return commands;
    }
}
