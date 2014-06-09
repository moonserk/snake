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
                    t.grow();
                }
                component.repaint();
                System.out.println(Panel.snake.getX() + "  " + Panel.snake.getY());
                Thread.sleep(400);
            }

        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}