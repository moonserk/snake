import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

/**
 * Created by Gregory on 22.05.2014.
 */
public class Snake {
    public final static int SNAKE_SIZE = 25;
    private int x;
    private int y;
    private int lastKey;

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
        if(x > 400 ){
            x = 0;
        }
        else if(x < 0){
            x =400;
        }
        else if(y > 400){
            y = 0;
        }
        else if(y < 0){
            y = 400;
        }
    }

    public void movements(){
        if(lastKey == KeyEvent.VK_DOWN){
            y += SNAKE_SIZE;
        }
        else if(lastKey == KeyEvent.VK_UP){
            y -= SNAKE_SIZE;
        }
        else if(lastKey == KeyEvent.VK_LEFT){
            x -= SNAKE_SIZE;
        }
        else if(lastKey == KeyEvent.VK_RIGHT){
            x += SNAKE_SIZE;
        }
    }

    public Shape addSnake(){
            return new Ellipse2D.Double(x, y, SNAKE_SIZE, SNAKE_SIZE);
    }

    public Shape addBodyOfSnake(){ return new Ellipse2D.Double(x, y,  SNAKE_SIZE, SNAKE_SIZE); }
}
