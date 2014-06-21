import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

public class Snake {

    public final static int SNAKE_SIZE = 25;

    private int x = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;
    private int y = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;
    static int key = 0;
    static int lastKey;


    public void setLastKey(int lastKey){ this.lastKey = lastKey; }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void bounds(){
        if(x == 400 && lastKey == KeyEvent.VK_RIGHT){
            x = -25;
        }
        else if(x == 0 && lastKey == KeyEvent.VK_LEFT){
            x = 425;
        }
        else if(y == 400 && lastKey == KeyEvent.VK_DOWN){
            y = -25;
        }
        else if(y == 0 && lastKey == KeyEvent.VK_UP){
            y = 425;
        }
    }

    public void movements(){
        if(lastKey == KeyEvent.VK_DOWN && key != 2){
            y += SNAKE_SIZE;
            key = 1;
        }
        else if(lastKey == KeyEvent.VK_DOWN && key == 2){
            y -= SNAKE_SIZE;
            key = 2;
        }

        if(lastKey == KeyEvent.VK_UP && key != 1){
            y -= SNAKE_SIZE;
            key = 2;
        }
        else if(lastKey == KeyEvent.VK_UP && key == 1){
            y += SNAKE_SIZE;
            key = 1;
        }

        if(lastKey == KeyEvent.VK_LEFT && key != 4){
            x -= SNAKE_SIZE;
            key = 3;
        }
        else if(lastKey == KeyEvent.VK_LEFT && key == 4){
            x += SNAKE_SIZE;
            key = 4;
        }

        if(lastKey == KeyEvent.VK_RIGHT && key != 3){
            x += SNAKE_SIZE;
            key = 4;
        }
        else if(lastKey == KeyEvent.VK_RIGHT && key == 3){
            x -= SNAKE_SIZE;
            key = 3;
        }
    }

    public Shape addSnake(){
            return new Ellipse2D.Double(x, y, SNAKE_SIZE, SNAKE_SIZE);
    }
}
