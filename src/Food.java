import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * Created by Gregory on 18.06.2014.
 */
public class Food {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void Move(){
        int x = (int) Math.floor(Math.abs(Math.random() * 425));
        int y = (int) Math.floor(Math.abs(Math.random() * 425));
        x /= Snake.SNAKE_SIZE;
        y /= Snake.SNAKE_SIZE;
        x *= Snake.SNAKE_SIZE;
        y *= Snake.SNAKE_SIZE;
        this.x = x;
        this.y = y;
    }

    public Shape getFood(){
        return new Ellipse2D.Double(x, y, Snake.SNAKE_SIZE, Snake.SNAKE_SIZE);
    }

}
