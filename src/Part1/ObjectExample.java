package Part1;
import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        /*
        Objects are created from a class
        p1 is an instance (object) of the pen class
        Instantiating an object = making an object
        */
        p1.move(25);
        p1.move(-30,50);
        // Every method is counted as a specific class in jav known as Object and it comes with a base set of abilities
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        //even though all pens are different they all fall under the pen commands
        //Rainbo pen can use Pen as a label instead of Rainbow Pen but Wiggle Pen must eb WigglePen
        
    }
    
}
