package dk.gotler.ded.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 06-11-2014!
 */
public class GameView {
    private GameModel model;
    private SpriteBatch spriteBatch;
    private List<Drawable> drawables;

    public GameView(GameModel model) {
        this.model = model;
        spriteBatch = new SpriteBatch();
        drawables = new ArrayList<Drawable>();
    }

    public void drawGame(){
        //Layers
        //Perhaps a list of textures pr. layer, draw them in the correct order.
        //Draw background with a tilemap?
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        for (Drawable sprite : drawables) {
            sprite.draw(spriteBatch);
        }
        spriteBatch.end();
    }

    public void addDrawable(Drawable drawable) {
        drawables.add(drawable);
    }
}
