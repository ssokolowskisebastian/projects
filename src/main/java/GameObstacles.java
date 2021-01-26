import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameObstacles extends JPanel implements ActionListener {
    Timer timer=new Timer(5, this);
    int x=0,deltaX=2;
    int y=0,deltaY=3;




    public void paint(Graphics g) {


        g.setColor(new Color(110,0,0));
        g.fillRect(400, y, 30, 30);
        g.setColor(new Color(10,240,0));
        g.fillRect(200, y, 30, 30);
        g.setColor(new Color(190,110,10));
        g.fillRect(300, y, 30, 30);
        timer.start();


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>900){
            x=0;
        }else if(y>900){
            y=0;
        }
        x=x+deltaX;
        y=y+deltaY;
        //z=z+deltaZ;
        repaint();

    }
}
