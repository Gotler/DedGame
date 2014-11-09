package dk.gotler.ded.game.player;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dk.gotler.ded.game.IDrawable;
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
        controller = new PlayerController(model);
        view = new PlayerView(model);

    }

    public IDrawable getPlayerView(){
        return view;
    }

    public Command getUpdateCommand(){
        return controller.getUpdateCommand();
    }

    public PlayerController getController() {
        return controller;
    }
}
