package dk.gotler.ded.game.player;

import dk.gotler.ded.game.Drawable;
import dk.gotler.ded.game.util.Command;
/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerMvcFactory {
    private PlayerController controller;
    private PlayerModel model;
    private PlayerView view;

    public PlayerMvcFactory(){
        model = new PlayerModel();
        view = new PlayerView(model);
        controller = new PlayerController(model, view);

    }

    public Drawable getPlayerView(){
        return view;
    }

    public Command getUpdateCommand(){
        return controller.getUpdateCommand();
    }

    public PlayerController getController() {
        return controller;
    }
}
