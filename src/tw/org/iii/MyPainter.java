package tw.org.iii;

import javax.swing.*;
import java.awt.*;

/**
 * Created by iii-user on 2016/11/11.
 */
public class MyPainter extends JFrame{
    private JButton clear , undo , redo ;
    private MyPanel myPanel;

    public MyPainter() {
        super("簽名板");
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new FlowLayout());
        clear = new JButton("Clear");
        undo = new JButton("Undo");
        redo = new JButton("Redo");
        top.add(clear);
        top.add(undo);
        top.add(redo);
        add(top,BorderLayout.NORTH);

        myPanel = new MyPanel();
        add(myPanel,BorderLayout.CENTER);

        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MyPainter();
    }
}
