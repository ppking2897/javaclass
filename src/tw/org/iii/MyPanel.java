package tw.org.iii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by iii-user on 2016/11/11.
 */
public class MyPanel extends JPanel {
    //很多條線內有很多條線，一條線裡面有很多點
    private LinkedList<LinkedList<HashMap<String,Integer>>> lines , recycle;
    private MyMouseListener myMouseListener;

    public MyPanel(){
        myMouseListener = new MyMouseListener();
        addMouseMotionListener(myMouseListener);
        addMouseListener(myMouseListener);
        lines = new LinkedList<>();
        recycle = new LinkedList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.BLACK);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(2));

        for( LinkedList<HashMap<String,Integer>> line : lines){
            // line(4) => 0-1, 1-2, 2-3
            for (int i=1; i<line.size(); i++){
                HashMap<String,Integer> p0 = line.get(i-1);
                HashMap<String,Integer> p1 = line.get(i);
                g2d.drawLine(p0.get("x"), p0.get("y"),
                        p1.get("x"), p1.get("y"));
            }
        }
    }

    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
//            super.mousePressed(e);
            LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
            int x = e.getX(); int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x", x); point.put("y", y);
            line.add(point);
            lines.add(line);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX(); int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x", x); point.put("y", y);
            //將點加入到最新的最後產生的線
            lines.getLast().add(point);
            recycle.clear();
            repaint();
        }

    }

    void clear(){
        lines.clear();
        repaint();
    }

    void undo(){
        if(lines.size()>0) {
            recycle.add(lines.removeLast());
            repaint();
        }
    }

    void redo(){
        if(recycle.size()>0) {
            lines.add(recycle.removeLast());
            repaint();
        }
    }

}

