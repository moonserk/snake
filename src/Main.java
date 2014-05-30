import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Frame extends JFrame{

    public Frame(){
        setSize(415, 435);
        setTitle("Snake");

        Panel panel = new Panel();
        add(panel);
    }
}

class Panel extends JPanel{

    Snake snake;
    PaintSnake paintSnake;

    public Panel(){
        setLayout(new BorderLayout());
        setFocusable(true);

        snake = new Snake();
        paintSnake = new PaintSnake();

        add(paintSnake);
        paintSnake.addSnake(snake);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    snake.setLastKey(e.getKeyCode());
                }
                else if(e.getKeyCode() == KeyEvent.VK_UP){
                    snake.setLastKey(e.getKeyCode());
                }
                else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    snake.setLastKey(e.getKeyCode());
                }
                else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    snake.setLastKey(e.getKeyCode());
                }
                else if(e.getKeyCode() == KeyEvent.VK_L){
                    paintSnake.addOtherSnake(snake);
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Runnable r = new RunnableSnake(snake, paintSnake);
        Thread t = new Thread(r);
        t.start();

    }
}