package game.ghostStrategies;

import game.Game;
import game.GameplayPanel;
import game.entities.Position;
import game.entities.ghosts.Ghost;
import game.utils.Utils;

//Stratégie concrète d'Inky (le fantôme bleu)
public class InkyStrategy implements IGhostStrategy{
    private Ghost otherGhost;
    private final Position SCATTER_TARGET = new Position(GameplayPanel.width, GameplayPanel.height);

    public InkyStrategy(Ghost ghost) {
        this.otherGhost = ghost;
    }

    //Inky se base sur la position de Blinky pour cibler Pacman : on prend un vecteur entre la position de Blinky et une case devant Pacman, et additionne ce vecteur à la position une case devant Pacman pour obtenir la cible d'Inky
    @Override
    public Position getChaseTargetPosition() {
        int[] pacmanFacingPosition = Utils.getPointDistanceDirection(Game.getPacman().getXPos(), Game.getPacman().getYPos(), 32d, Utils.directionConverter(Game.getPacman().getDirection()));
        double distanceOtherGhost = Utils.getDistance(pacmanFacingPosition[0], pacmanFacingPosition[1], otherGhost.getXPos(), otherGhost.getYPos());
        double directionOtherGhost = Utils.getDirection(otherGhost.getXPos(), otherGhost.getYPos(), pacmanFacingPosition[0], pacmanFacingPosition[1]);
        int[] blinkyVectorPosition = Utils.getPointDistanceDirection(pacmanFacingPosition[0], pacmanFacingPosition[1], distanceOtherGhost, directionOtherGhost);

        return new Position(blinkyVectorPosition[0], blinkyVectorPosition[1]);
    }

    //En pause, Inky cible la case en bas à droite
    @Override
    public Position getScatterTargetPosition() {
        return SCATTER_TARGET;
    }
}
