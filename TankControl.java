package battlecity.com;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TankControl {
    private static final int WIDTH = 60;
    int x = 50;
    int xa = 0;
    int y = 150;
    int ya=0;
    int a = 0;
    int aa =0;
    private Map map;

    public TankControl(Map map) {
        this.map = map;

    }

    public void move() {
        if (x + xa >= 0 )
            x = x + xa;

        if (y+ ya >= 0 )
            y = y + ya;
        System.out.println(x + "  " + y);

    }

    public void paint(Graphics2D g) {

        g.fillRect(x, y, 60, 60);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
        ya = 0;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y, WIDTH, WIDTH);
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -10;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 10;
        if (e.getKeyCode() == KeyEvent.VK_UP)
            ya = -10;
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            ya = 10;

    }
}