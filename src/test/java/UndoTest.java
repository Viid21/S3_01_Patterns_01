import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UndoTest {

    @BeforeEach
    void init() {
        Undo undo = Undo.getInstance();
        undo.getCommands().clear();
    }

    @Test
    void givenSingletonInstance_whenGetInstance_thenAlwaysSameObject() {
        Undo u1 = Undo.getInstance();
        Undo u2 = Undo.getInstance();
        assertSame(u1, u2);
    }

    @Test
    void givenEmptyHistory_whenAddCommands_thenCommandsAreStored() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");

        assertEquals(2, undo.getCommands().size());
        assertEquals("mkdir carpeta", undo.getCommands().get(0));
        assertEquals("cd carpeta", undo.getCommands().get(1));
    }

    @Test
    void givenHistoryWithCommands_whenUndoCommand_thenLastCommandIsRemoved() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");

        String undone = undo.undoCommand();
        assertEquals("cd carpeta", undone);
        assertEquals(1, undo.getCommands().size());
        assertEquals("mkdir carpeta", undo.getCommands().peek());
    }

    @Test
    void givenEmptyHistory_whenUndoCommand_thenReturnNull() {
        Undo undo = Undo.getInstance();
        String undone = undo.undoCommand();
        assertNull(undone);
    }
}
