import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintSnake extends JPanel {

    static ArrayList<Tile> tile = new ArrayList<Tile>();

    public void addTile(){
        tile.add(new Tile(getSnakeX(),getSnakeY()));
    }

    public void addOtherTile(){
        tile.add(new Tile((int) tile.get(tile.size() - 1).getX(), (int) tile.get(tile.size() - 1).getY()));
    }


    public static int getTileX(int i){
        return (int) tile.get(i).getX();
    }

    public static int getTileY(int i){
        return (int) tile.get(i).getY();
    }

    public static int getSnakeX(){
        return (int) Panel.snake.getX();
    }
    public static int getSnakeY(){
        return (int) Panel.snake.getY();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.fill(Panel.snake.addSnake());

        for(Tile t : tile){
            g2.fill(t.addSnake());
        }
    }
}
