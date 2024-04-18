
import java.applet.*;
import java.awt.*;

public class fractal extends Applet {

    public static void main(String[] args) {
        fractal fractalApplet = new fractal();
        fractalApplet.init();
    }
    
    public void init(){
        setBackground(Color.CYAN);
        setSize(800,1200);
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("Applet Fractal", 20, 20);
    }
}
