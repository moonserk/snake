import java.awt.*;

/**
 * Created by Gregory on 22.05.2014.
 */
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
                component.repaint();
                Thread.sleep(400);
            }

        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
