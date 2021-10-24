package battlecity.com;

import java.awt.*;
import java.util.Random;
import java.awt.Graphics2D;
public class EnemyTank {
    private static final int SIDE = 55;
    int x = 200;
    int y = 150;
    int xa = 1;
    int ya = 1;
    int move = 10;
    int moveback = -10;
    private Map map;
    Random random = new Random();
    int ran = random.nextInt(3);
    boolean gameover = true;
    int [][] movement = {{0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,1,0,0,0,0,0,1,0,1,0},
                         {0,1,0,1,0,0,0,0,0,1,0,1,0},
                         {0,1,0,1,0,0,0,0,0,1,0,1,0},
                         {0,1,0,1,0,0,0,0,0,1,0,1,0},
                         {0,1,0,1,0,0,0,0,0,1,0,1,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0}} ;

    public EnemyTank(Map map) {
        this.map = map;


    }

    void move1() {

        while(true){
            ran = random.nextInt(4);
            System.out.println(ran);
            if (ran == 0)
                x += move;

            if(ran == 1)
                x += moveback;

            if(ran == 2)
                y += moveback;

            if(ran == 3)
                y += moveback;


        }

    }
    private boolean collision(){
        return map.tankcontrol.getBounds().intersects(getBounds());
    }

    public Rectangle getBounds(){
        return new Rectangle(x+200,y+150,SIDE, SIDE);
    }
        public void paint(Graphics2D g) {
        System.out.println("postion:" + x + " " + y);
            g.fillRect(x, y, 55, 55);
        }
    }
