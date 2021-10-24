package battlecity.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class MainTank extends JFrame implements KeyListener {
    JLabel maintank;
    JLabel label;
     MainTank() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500,500);
//         this.setLayout(null);
//         this.addKeyListener(this);
//         label = new JLabel();
//         label.setBounds(0, 0, 100, 100);
//        label.setBackground(Color.RED);
//        label.setOpaque(true);
//        label.setIcon(new ImageIcon("C:\\Users\\MSI GF\\Pictures\\Maintank.PNG"));
//         //label.setBackground(Color.red);
//
//         this.getContentPane().setBackground(Color.black);
//         this.add(label);
//         this.setVisible(true);

        maintank = new JLabel();
        maintank.setBounds(10,1,60,60);
        maintank.setBackground(Color.red);
        maintank.setOpaque(true);
        maintank.setVisible(true);
        maintank.setText("ABC");
      maintank.setIcon(new ImageIcon("C:\\Users\\MSI GF\\Pictures\\Maintank.PNG"));
        this.add(maintank);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37:
            maintank.setLocation(maintank.getX()-10, maintank.getY());
            break;
            case 38:
                maintank.setLocation(maintank.getX(), maintank.getY()-10);
                break;
            case 39:
                maintank.setLocation(maintank.getX()+10, maintank.getY());
                break;
            case 40:
                maintank.setLocation(maintank.getX(), maintank.getY()+10);
                break;
        }

    }
}