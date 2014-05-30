import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Gregory on 22.05.2014.
 */
public class PaintSnake extends JPanel {

    public static LinkedList<Snake> snake = new LinkedList<Snake>();

    public void addSnake(Snake s){
        snake.add(s);
    }

    public void addOtherSnake(Snake s){
        snake.add(s);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for(Snake s : snake){

            g2.fill(s.addSnake());

        }
    }
}
