package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import sudoku.problemdomain.SudokuGame;

public class UserInterfaceImpl implements IUserInterfaceContract.view,
        EventHandler<KeyEvent> {

    private final Stage stage;
    private final Group root;

    private HashMap<Coordinates, SudokuTestField> textFieldCoordinates;

    private IUserInterfaceContract.EventListener listener;

    @Override
    public void handle(KeyEvent keyEvent) {

    }

    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {

    }

    @Override
     public void updateSquare(int x, int y , int input) {

    }
}