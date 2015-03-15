package dk.gotler.ded.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import dk.gotler.ded.game.util.Command;
import dk.gotler.ded.game.util.Coords2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerController {
    public static final int MS = 3;
    private final List<Integer> left_keys = new ArrayList<Integer>();
    private final List<Integer> up_keys = new ArrayList<Integer>();
    private final List<Integer> right_keys = new ArrayList<Integer>();
    private final List<Integer> down_keys = new ArrayList<Integer>();
    private PlayerModel model;
    private PlayerView view;
    private Coords2D mouseCoords = new Coords2D();

    public PlayerController(PlayerModel model, PlayerView view) {
        this.view = view;
        left_keys.add(Input.Keys.LEFT);
        left_keys.add(Input.Keys.A);
        right_keys.add(Input.Keys.RIGHT);
        right_keys.add(Input.Keys.D);
        down_keys.add(Input.Keys.DOWN);
        down_keys.add(Input.Keys.S);
        up_keys.add(Input.Keys.UP);
        up_keys.add(Input.Keys.W);
        this.model = model;

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean mouseMoved(int screenX, int screenY) {
                mouseCoords.x = screenX;
                mouseCoords.y = screenY;
                return true;
            }
        });
    }

    public Command getUpdateCommand() {
        return new Command() {
            @Override
            public void execute() {
                for (Integer key : left_keys) {
                    if (Gdx.input.isKeyPressed(key)) {
                        model.move(-MS, 0);
                    }
                }
                for (Integer key : right_keys) {
                    if (Gdx.input.isKeyPressed(key)) {
                        model.move(MS, 0);
                    }
                }
                for (Integer key : up_keys) {
                    if (Gdx.input.isKeyPressed(key)) {
                        model.move(0, MS);
                    }
                }
                for (Integer key : down_keys) {
                    if (Gdx.input.isKeyPressed(key)) {
                        model.move(0, -MS);
                    }
                }
                view.pointAt(mouseCoords);
            }
        };
    }
}
