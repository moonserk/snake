import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

public class Tile extends Snake{

    public static int numb = -1;
    public int n;

    private int xMemory;
    private int yMemory;

    public Tile(int x, int y){
        setX(x);
        setY(y);
        n = numb;
        numb++;
    }

    public void grow(){
        if(n == -1) {
            xMemory = (int) getX();
            yMemory = (int) getY();
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
        }
        else if(PaintSnake.tile.isEmpty() == false){
            xMemory = (int) getX();
            yMemory = (int) getY();
            setX(PaintSnake.tile.get(n).xMemory);
            setY(PaintSnake.tile.get(n).yMemory);
        }
    }
}
