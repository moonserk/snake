import java.awt.event.KeyEvent;

public class Tile extends Snake{

    public static int numb = -1;
    public int n;

    private int xMemory;
    private int yMemory;

    public Tile(){
        n = numb;
        numb++;
        if(n != -1){
            setX((int) PaintSnake.tile.get(PaintSnake.tile.size() - 1).getX());
            setY((int) PaintSnake.tile.get(PaintSnake.tile.size() - 1).getY());
        }
        else{
            addTileToEndOFSnake();
        }
    }

    public void grow(){
        if(n == -1) {
            xMemory = (int) getX();
            yMemory = (int) getY();
            addTileToEndOFSnake();
        }
        else if(PaintSnake.tile.isEmpty() == false){
            xMemory = (int) getX();
            yMemory = (int) getY();
            setX(PaintSnake.tile.get(n).xMemory);
            setY(PaintSnake.tile.get(n).yMemory);
        }
    }

    private void addTileToEndOFSnake(){
        if (Snake.lastKey == KeyEvent.VK_DOWN && Snake.key != 2) {
            setY((int) Panel.snake.getY() - SNAKE_SIZE);
            setX((int) Panel.snake.getX());
        }
        else if (Snake.lastKey == KeyEvent.VK_DOWN && Snake.key == 2) {
            setY((int) Panel.snake.getY() + SNAKE_SIZE);
            setX((int) Panel.snake.getX());
        }

        if (Snake.lastKey == KeyEvent.VK_UP  && Snake.key != 1) {
            setY((int) Panel.snake.getY() + SNAKE_SIZE);
            setX((int) Panel.snake.getX());
        }
        else if (Snake.lastKey == KeyEvent.VK_UP  && Snake.key == 1) {
            setY((int) Panel.snake.getY() - SNAKE_SIZE);
            setX((int) Panel.snake.getX());
        }

        if (Snake.lastKey == KeyEvent.VK_LEFT && Snake.key != 4) {
            setX((int)Panel.snake.getX() + SNAKE_SIZE);
            setY((int)Panel.snake.getY());
        }
        else if (Snake.lastKey == KeyEvent.VK_LEFT && Snake.key == 4) {
            setX((int)Panel.snake.getX() - SNAKE_SIZE);
            setY((int)Panel.snake.getY());
        }

        if (Snake.lastKey == KeyEvent.VK_RIGHT && Snake.key != 3) {
            setX((int)Panel.snake.getX() - SNAKE_SIZE);
            setY((int)Panel.snake.getY());
        }
        else if (Snake.lastKey == KeyEvent.VK_RIGHT&& Snake.key == 3) {
            setX((int)Panel.snake.getX() + SNAKE_SIZE);
            setY((int)Panel.snake.getY());
        }
    }

}
