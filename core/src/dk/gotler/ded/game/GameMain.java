package dk.gotler.ded.game;

import com.badlogic.gdx.ApplicationAdapter;


public class GameMain extends ApplicationAdapter {
    GameView gameView;
    GameController gameController;
	
	@Override
	public void create () {
        GameMvcFactory gameMvcFactory = new GameMvcFactory();
        gameView = gameMvcFactory.getView();
        gameController = gameMvcFactory.getController();
    }

	@Override
	public void render () {
        gameController.update();
        gameView.drawGame();
    }
}
