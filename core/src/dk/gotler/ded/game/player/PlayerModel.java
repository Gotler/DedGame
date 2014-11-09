package dk.gotler.ded.game.player;

/**
 * Created by Martin on 06-11-2014!
 */
public class PlayerModel {
    private float x;
    private float y;

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void move(float x, float y){
        this.x += x;
        this.y += y;
    }
}
