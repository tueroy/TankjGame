package battlecity.com;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Map extends JPanel {
    final int mapx = 780, mapy = 780;
    final int GRID_SIZE = mapx / 13;
    int x = 0;
    int y = 0;
TankControl tankcontrol = new TankControl(this);
EnemyTank enemyTank =  new EnemyTank(this);
    public Map() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                tankcontrol.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                tankcontrol.keyPressed(e);
            }
        });
        setFocusable(true);
    }

    private void move() {

        tankcontrol.move();
        enemyTank.move1();

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setColor(Color.RED);

        tankcontrol.paint(g2d);

        enemyTank.paint(g2d);

        Graphics2D brickblock = (Graphics2D) g;
        brickblock.setColor(Color.RED);

        Graphics stoneblock = (Graphics2D) g;
        stoneblock.setColor(Color.BLUE);

        Graphics halfbrick = (Graphics2D) g;
        halfbrick.setColor(Color.BLACK);

        // Top Left Components
        for (int i = 0; i < 4; i++) {
            brickblock.fillRect(GRID_SIZE, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }
        halfbrick.fillRect(GRID_SIZE, GRID_SIZE*4+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);

        for (int i = 0; i < 4; i++) {
            brickblock.fillRect(GRID_SIZE*3, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }
        halfbrick.fillRect(GRID_SIZE*3, GRID_SIZE*4+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);

        //Top Middle Components
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*5, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE*5, GRID_SIZE*3+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);
        stoneblock.drawRect(GRID_SIZE*6, GRID_SIZE*3, GRID_SIZE, GRID_SIZE);
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*7, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE*7, GRID_SIZE*3+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);

        //Top Right Components
        for (int i = 0; i < 4; i++) {
            brickblock.fillRect(GRID_SIZE*9, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }
        halfbrick.fillRect(GRID_SIZE*9, GRID_SIZE*4+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);
        for (int i = 0; i < 4; i++) {
            brickblock.fillRect(GRID_SIZE*11, GRID_SIZE*i+GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }       halfbrick.fillRect(GRID_SIZE*11, GRID_SIZE*4+GRID_SIZE, GRID_SIZE, GRID_SIZE/2);

        //Bottom Terrain
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE, GRID_SIZE*i+GRID_SIZE*9, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE, GRID_SIZE/2+GRID_SIZE*8, GRID_SIZE, GRID_SIZE/2);
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*3, GRID_SIZE*i+GRID_SIZE*9, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE*3, GRID_SIZE/2+GRID_SIZE*8, GRID_SIZE, GRID_SIZE/2);

        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*9, GRID_SIZE*i+GRID_SIZE*9, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE*9, GRID_SIZE/2+GRID_SIZE*8, GRID_SIZE, GRID_SIZE/2);
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*11, GRID_SIZE*i+GRID_SIZE*9, GRID_SIZE, GRID_SIZE);
        }halfbrick.fillRect(GRID_SIZE*11, GRID_SIZE/2+GRID_SIZE*8, GRID_SIZE, GRID_SIZE/2);

        //Middle Components(left)
        brickblock.fillRect(GRID_SIZE*2, GRID_SIZE*6+GRID_SIZE/2, GRID_SIZE*2, GRID_SIZE);
        //Middle Components(Right)
        brickblock.fillRect(GRID_SIZE*9, GRID_SIZE*6+GRID_SIZE/2, GRID_SIZE*2, GRID_SIZE);

        //Middle Components(Bottom)
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*5, GRID_SIZE*i+GRID_SIZE*7+GRID_SIZE/2, GRID_SIZE, GRID_SIZE);
        }
        brickblock.fillRect(GRID_SIZE*6, GRID_SIZE*8, GRID_SIZE*2, GRID_SIZE);
        for (int i = 0; i < 3; i++) {
            brickblock.fillRect(GRID_SIZE*7, GRID_SIZE*i+GRID_SIZE*7+GRID_SIZE/2, GRID_SIZE, GRID_SIZE);
        }
        //measure Grid
//        for (int i = 0; i < 13; i++) {
//            brickblock.drawRect(0, GRID_SIZE*i, GRID_SIZE, GRID_SIZE);
//        }
//        for (int i = 0; i < 13; i++) {
//            brickblock.drawRect(GRID_SIZE*i, 0, GRID_SIZE, GRID_SIZE);
//        }
    }
    public static void main(String[] args) throws InterruptedException{
        JLabel maintank;
        final int mapx = 780, mapy = 780;
        final int GRID_SIZE = mapx / 13;
        final int MAP_ROW = 13;
        JFrame maptank = new JFrame("Tank Map");
        maptank.setSize(mapx+15, mapy+39);
        Map map = new Map();
        maptank.add(map);
//        maptank.add(new Map());
        maptank.setLocationRelativeTo(null);
        maptank.setBackground(Color.BLACK);
        maptank.setResizable(false);
        maptank.setVisible(true);
        maptank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            map.move();
           map.repaint();
            Thread.sleep(10);
        }

    }

}








