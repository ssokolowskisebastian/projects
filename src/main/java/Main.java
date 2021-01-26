import javax.swing.*;
import java.awt.*;

public class Main {

    public Main(){

        JFrame jFrame=new JFrame();
        GamePanel gamePanel=new GamePanel();
//        GameObstacles gObst=new GameObstacles();
//        Gamer gamer = new Gamer();
        jFrame.add(gamePanel);
//        jFrame.add(gObst);
//        jFrame.add(gamer);
        jFrame.setTitle("siema");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }




    public static void main(String[] args) {
        new Main();



    }
}
