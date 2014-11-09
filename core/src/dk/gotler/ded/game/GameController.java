package dk.gotler.ded.game;

import dk.gotler.ded.game.player.PlayerController;
import dk.gotler.ded.game.util.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 06-11-2014!
 */
public class GameController {

    private GameModel model;
    private PlayerController playerController;
    private List<Command> updateCommands;

    public GameController(GameModel model, PlayerController playerController) {

        this.model = model;
        this.playerController = playerController;
        updateCommands = new ArrayList<Command>();
    }

    public void update() {
        for (Command command : updateCommands) {
            command.execute();
        }
        //Handle keyboard input!
    }

    public void addUpdateCommand(Command command) {
        updateCommands.add(command);
    }
}
