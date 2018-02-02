package drawcircle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Andrew
 */
public class DrawPane extends JPanel implements KeyListener{
        CircleObject c;
        Graphics gobject;
        public void paintComponent(Graphics g){
           //this.gobject = g;
           g.setColor(c.getColor());
           g.fillOval(c.getX(), c.getY(), c.getRadius(), c.getRadius());
           //System.out.println(c.getX());
        }
        public DrawPane (CircleObject c) {
            this.c = c;
            this.addKeyListener(this);
            this.setFocusable(true);
        }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //ystem.out.println("It worked!");
            int newX = c.getX();
            newX++;
            c.setX(newX);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            //System.out.println("It worked!");
            int newX = c.getX();
            newX--;
            c.setX(newX);
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
