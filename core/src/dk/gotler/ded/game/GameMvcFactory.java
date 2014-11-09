package dk.gotler.ded.game;

import dk.gotler.ded.game.player.PlayerController;
import dk.gotler.ded.game.player.PlayerMvcFactory;
import dk.gotler.ded.game.util.Command;

/**
 * Created by Martin on 08-11-2014!
 */
public class GameMvcFactory {
    private GameModel model;
    private GameView view;
    private GameController controller;

    public GameMvcFactory(){
        PlayerMvcFactory playerMvcFactory = new PlayerMvcFactory();
        model = new GameModel();
        view = new GameView(model);
        view.addDrawable(playerMvcFactory.getPlayerView());
        controller = new GameController(model, playerMvcFactory.getController());
        controller.addUpdateCommand(playerMvcFactory.getUpdateCommand());
    }

    public GameController getController(){
        return controller;
    }

    public GameView getView() {
        return view;
    }
}
