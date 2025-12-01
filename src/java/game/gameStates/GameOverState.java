package game.gameStates;

import game.Game;
import game.GameLauncher;
import game.GameplayPanel;
import game.utils.KeyHandler;
import java.awt.*;

public class GameOverState implements GameState {
    private Game game;
    public GameOverState(Game game) { this.game = game; }

    @Override public void init() {}
    @Override public void update() {}

    @Override
    public void input(KeyHandler k) {
        if (k.k_up.isPressed) game.setState(new PlayState(game)); // 재시작
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, GameplayPanel.width, GameplayPanel.height);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("GAME OVER", 60, 200);
        g.drawString("Score: " + GameLauncher.getUIPanel().getScore(), 60, 230);
        g.drawString("Press 'UP' to Restart", 40, 300);
    }
}