import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

/**
 * Created by Gregory on 04.06.2014.
 */
public class Tile extends Snake{

    public static int numb = -1;
    public int n;
    public Tile(int x, int y){
        setX(x);
        setY(y);
        n = numb;
        numb++;
    }

    public void grow(){
        if(n == -1) {
            if (Snake.lastKey == KeyEvent.VK_DOWN) {
                setY(PaintSnake.getSnakeY() - SNAKE_SIZE);
                setX(PaintSnake.getSnakeX());
            } else if (Snake.lastKey == KeyEvent.VK_UP) {
                setY(PaintSnake.getSnakeY() + SNAKE_SIZE);
                setX(PaintSnake.getSnakeX());
            } else if (Snake.lastKey == KeyEvent.VK_LEFT) {
                setX(PaintSnake.getSnakeX() + SNAKE_SIZE);
                setY(PaintSnake.getSnakeY());
            } else if (Snake.lastKey == KeyEvent.VK_RIGHT) {
                setX(PaintSnake.getSnakeX() - SNAKE_SIZE);
                setY(PaintSnake.getSnakeY());
            }
        }else if(PaintSnake.tile.isEmpty() == false){
            if (Snake.lastKey == KeyEvent.VK_DOWN) {
                setY(PaintSnake.getTileY(n) - SNAKE_SIZE);
                setX(PaintSnake.getTileX(n));
            } else if (Snake.lastKey == KeyEvent.VK_UP) {
                setY(PaintSnake.getTileY(n) + SNAKE_SIZE);
                setX(PaintSnake.getTileX(n));
            } else if (Snake.lastKey == KeyEvent.VK_LEFT) {
                setX(PaintSnake.getTileX(n) + SNAKE_SIZE);
                setY(PaintSnake.getTileY(n));
            } else if (Snake.lastKey == KeyEvent.VK_RIGHT) {
                setX(PaintSnake.getTileX(n) - SNAKE_SIZE);
                setY(PaintSnake.getTileY(n));
            }
        }
    }
}
