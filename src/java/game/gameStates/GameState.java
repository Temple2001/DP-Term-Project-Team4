package game.gameStates;

import game.utils.KeyHandler;
import java.awt.Graphics2D;

public interface GameState {
    void init();
    void update();
    void render(Graphics2D g);
    void input(KeyHandler k);
}