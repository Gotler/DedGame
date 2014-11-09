package dk.gotler.ded.game.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dk.gotler.ded.game.IDrawable;

/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerView implements IDrawable {
    private PlayerModel model;
    private Texture img;

    public PlayerView(PlayerModel model) {
        img = new Texture("badlogic.jpg");
        this.model = model;
    }

    public void draw(SpriteBatch spriteBatch){
        spriteBatch.draw(img, model.getX(), model.getY());
    }
}
