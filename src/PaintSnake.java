import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintSnake extends JPanel {

    static Food food = new Food();
    static ArrayList<Tile> tile = new ArrayList<Tile>();

    public static void addTile(){
        tile.add(new Tile());
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.GREEN);
        g2.fill(Panel.snake.addSnake());

        g2.setColor(Color.BLACK);
        for(Tile t : tile){
            g2.fill(t.addSnake());
        }

        g2.setColor(Color.RED);
        g2.fill(food.getFood());

    }
}
