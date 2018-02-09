package drawcircle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.util.Timer;

/**
 *
 * @author Andrew
 */
public class DrawPane extends JPanel implements MouseListener {

    JPanel drawpane = this;
    CircleObject c;
    Graphics gobject;

    public void paintComponent(Graphics g) {
        //this.gobject = g;
        g.setColor(c.getColor());
        g.fillOval((int) c.getX(), (int) c.getY(), c.getRadius(), c.getRadius());

        //System.out.println(c.getX());
    }

    public DrawPane(CircleObject c) {
        this.c = c;
        this.addMouseListener(this);
        this.setFocusable(true);
    }

    Timer timer = new Timer();
    TimerTask task = new MyTimerTask();
    MouseEvent e;

    public MouseEvent getE() {
        return e;
    }

    public void setE(MouseEvent e) {
        this.e = e;
    }

    private class MyTimerTask extends TimerTask {

        public void run() {
            double ym = (e.getLocationOnScreen().getY() - c.getY());
            double xm = (e.getLocationOnScreen().getX() - c.getX());

            if (c.getX() > e.getLocationOnScreen().getX()) {
                //System.out.println("It worked!");
                double newX = c.getX();
                newX = (c.getX() - xm);
                c.setX(newX);
                //y = mx + b
                //y - b = mx
                //(y - b)/m = x
            }
            if (c.getX() < e.getLocationOnScreen().x) {
                //System.out.println("It worked!");
                double newX = c.getX();
                newX = (c.getX() + xm);
                c.setX(newX);
            }
            if (c.getY() > e.getLocationOnScreen().y) {
                //System.out.println("It worked!");
                double newY = c.getY();
                newY = (c.getY() - ym);
                c.setY(newY);
            }
            if (c.getY() < e.getLocationOnScreen().y) {
                //System.out.println("It worked!");
                double newY = c.getY();
                newY = (c.getY() + ym);
                c.setY(newY);
            }
            drawpane.repaint();
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        timer = new Timer();
        task = new MyTimerTask();
        setE(e);
        timer.scheduleAtFixedRate(task, 0, 60);
        //try{timer.wait(100);} catch(Exception ex) {ex.printStackTrace();}
        //task.cancel();
    }
    @Override
    public void mousePressed(MouseEvent e) {

        // Time is in milliseconds
        // The second parameter is delay before the first run
        // The third is how often to run it
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        task.cancel();
        // Will not stop execution of task.run() if it is midway
        // But will guarantee that after this call it runs no more than one more time
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /*@Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //System.out.println("It worked!");
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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            //System.out.println("It worked!");
            int newY = c.getY();
            newY--;
            c.setY(newY);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            //System.out.println("It worked!");
            int newY = c.getY();
            newY++;
            c.setY(newY);
        }
        
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }*/
}
