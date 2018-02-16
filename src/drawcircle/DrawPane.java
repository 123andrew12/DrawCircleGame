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
import java.awt.event.MouseMotionListener;
import java.util.Timer;

/**
 *
 * @author Andrew
 */
public class DrawPane extends JPanel implements MouseListener, MouseMotionListener {

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
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
    }

    //Timer timer = new Timer();
    //TimerTask task = new MyTimerTask();
    MouseEvent e;

    public MouseEvent getE() {
        return e;
    }

    public void setE(MouseEvent e) {
        this.e = e;
    }

    /*private class MyTimerTask extends TimerTask {

        public void run() {
            double ym = (e.getLocationOnScreen().getY() - c.getY());
            double xm = (e.getLocationOnScreen().getX() - c.getX());

            
            drawpane.repaint();
        }
    }*/
    
    @Override
    public void mouseClicked(MouseEvent e) {
        /*timer = new Timer();
        task = new MyTimerTask();
        setE(e);
        timer.scheduleAtFixedRate(task, 0, 60);
        try{timer.wait(100);} catch(Exception ex) {ex.printStackTrace();}
        task.cancel();
        double movenumber = 10.0;
        double ym = (e.getLocationOnScreen().getY() - (c.getY()-100));
        double xm = (e.getLocationOnScreen().getX() - (c.getX()+100));
        double currentX = c.getX();
        double currentY = c.getY();
        double newX = currentX + xm;
        double newY = currentY + ym;
           for (int i = 0;i<movenumber+1;i++) {
                c.setX(currentX + xm/movenumber);
                c.setY(currentY + ym/movenumber);
                c.setX(e.getLocationOnScreen().getX()-c.getRadius()/2);
                c.setY(e.getLocationOnScreen().getY()-c.getRadius());
                System.out.println("YAHOO");
                drawpane.repaint();
            }*/
            
    }
    @Override
    public void mousePressed(MouseEvent e) {

        // Time is in milliseconds
        // The second parameter is delay before the first run
        // The third is how often to run it
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        task.cancel();
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

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e){
        double currentX = e.getLocationOnScreen().getX();
        double currentY = e.getLocationOnScreen().getY();
        
        for (int i = 0;i<51;i++) {
                c.setX(currentX + (e.getLocationOnScreen().getX()/50.0) -c.getRadius()/2);
                c.setY(currentY + (e.getLocationOnScreen().getY()/50.0) -c.getRadius()*1.5);
                System.out.println("YAHOO");
                drawpane.repaint();
            }
        try{Thread.sleep(16);} catch(Exception ex){ex.printStackTrace();};
    }
}
