package dk.gotler.ded.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import dk.gotler.ded.game.util.Command;

/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerController {
    private PlayerModel model;

    public PlayerController(PlayerModel model) {

        this.model = model;
    }

    public Command getUpdateCommand() {
        return new Command() {
            @Override
            public void execute() {
                if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                    model.move(-1, 0);
                }
                if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                    model.move(1, 0);
                }
                if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
                    model.move(0, -1);
                }
                if(Gdx.input.isKeyPressed(Input.Keys.UP)){
                    model.move(0, 1);
                }
            }
        };
    }
}
