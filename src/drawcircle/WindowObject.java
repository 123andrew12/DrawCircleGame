package drawcircle;
import javax.swing.JFrame;
/**
 *
 * @author Andrew
 */
public class WindowObject extends JFrame {

    private int width;
    private int height;
    public WindowObject (int width, int height, CircleObject c) {
        this.width = width;
        this.height = height;
        this.setContentPane(new DrawPane(c));
        this.setSize(width, height);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
