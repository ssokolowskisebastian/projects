import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gamer extends JPanel implements KeyListener, ActionListener {

    int z=0,deltaZ=0;

    public void paint(Graphics g){
        g.setColor(new Color(0,0,0));
        g.fillOval(100+z, 500, 30, 30);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    void left(){
        deltaZ=-1;

    }
    void right(){
        deltaZ=1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(z<0){
            z=900;
        }else if(z>900){
            z=0;
        }

        z=z+deltaZ;
        paint(null);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_LEFT){
            left();
        }else if(code==KeyEvent.VK_RIGHT){
            right();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
