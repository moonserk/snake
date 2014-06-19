import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * Created by Gregory on 18.06.2014.
 */
public class Food {

    private int x = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;
    private int y = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void Move(){
        this.x = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;;
        this.y = ((int) Math.abs(Math.random() * 425) / Snake.SNAKE_SIZE) * Snake.SNAKE_SIZE;;
    }

    public Shape getFood(){
        return new Ellipse2D.Double(x, y, Snake.SNAKE_SIZE, Snake.SNAKE_SIZE);
    }

}
