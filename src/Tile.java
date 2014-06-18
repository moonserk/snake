import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

public class Tile extends Snake{

    public static int numb = -1;
    public int n;

    private int xMemory;
    private int yMemory;

    public Tile(){
        n = numb;
        numb++;
    }

    public void grow(){
        if(n == -1) {
            xMemory = (int) getX();
            yMemory = (int) getY();
            if (Snake.lastKey == KeyEvent.VK_DOWN) {
                setY((int)Panel.snake.getY() - SNAKE_SIZE);
                setX((int)Panel.snake.getX());
            } else if (Snake.lastKey == KeyEvent.VK_UP) {
                setY((int)Panel.snake.getY() + SNAKE_SIZE);
                setX((int)Panel.snake.getX());
            } else if (Snake.lastKey == KeyEvent.VK_LEFT) {
                setX((int)Panel.snake.getX() + SNAKE_SIZE);
                setY((int)Panel.snake.getY());
            } else if (Snake.lastKey == KeyEvent.VK_RIGHT) {
                setX((int)Panel.snake.getX() - SNAKE_SIZE);
                setY((int)Panel.snake.getY());
            }
        }
        else if(PaintSnake.tile.isEmpty() == false){
            xMemory = (int) getX();
            yMemory = (int) getY();
            setX(PaintSnake.tile.get(n).xMemory);
            setY(PaintSnake.tile.get(n).yMemory);
        }
    }
}
