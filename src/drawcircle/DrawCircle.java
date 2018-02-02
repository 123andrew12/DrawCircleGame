package drawcircle;
import drawcircle.WindowObject;
import java.awt.Color;
/**
 *
 * @author Andrew
 */
public class DrawCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleObject c = new CircleObject(50,50,100,Color.RED);
        WindowObject w = new WindowObject(500,500,c);
        
    }
    
}
