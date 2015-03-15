package dk.gotler.ded.game.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dk.gotler.ded.game.Drawable;
import dk.gotler.ded.game.util.Coords2D;

/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerView implements Drawable {
    private PlayerModel model;
    private Texture img;

    public PlayerView(PlayerModel model) {
        img = new Texture("dude.png");
        this.model = model;
    }

    public void draw(SpriteBatch spriteBatch){
        spriteBatch.draw(img, model.getX(), model.getY(), 100, 100);
    }

    public void pointAt(Coords2D mouseCoords) {
        //Calculate rotation!
    }
}
