import javax.swing.*;
import java.awt.*;

public class RunnableSnake implements Runnable {

    Snake snake;
    Component component;

    public RunnableSnake(Snake snake, Component component){
        this.snake = snake;
        this.component = component;

    }

    @Override
    public void run() {

        try {

            for(;;) {
                snake.bounds();
                snake.movements();

                for(Tile t : PaintSnake.tile){
                    if(snake.getX() == t.getX() && snake.getY() == t.getY()){
                        JOptionPane.showMessageDialog(component, "Collapse, you are lose. Your score: " + Food.getScore());
                        return;
                    }
                    t.grow();
                }

                if(snake.getX() == PaintSnake.food.getX() && snake.getY() == PaintSnake.food.getY()){
                    PaintSnake.food.Move();
                    Food.setScore(Food.getScore() + 1);
                    PaintSnake.addTile();
                }

                component.repaint();
                Thread.sleep(400);
            }

        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}