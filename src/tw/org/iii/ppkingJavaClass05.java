package tw.org.iii;

import javax.swing.*;
import java.util.Scanner;
public class ppkingJavaClass05 {
    public  static  void main(String[] pptest) {
        String strscore = JOptionPane.showInputDialog("Input Score");
        int intScore = Integer.parseInt(strscore);
        System.out.println(intScore);
        char Pass;
        if (intScore >= 90) {
            JOptionPane.showMessageDialog(null , "A");
            Pass = 'A';
        } else {
            if (intScore >= 80) {
                JOptionPane.showMessageDialog(null , "B");
                Pass = 'B';
            } else {
                if (intScore >= 70) {
                    JOptionPane.showMessageDialog(null , "C");
                    Pass = 'C';
                } else {
                    if (intScore >= 60) {
                        JOptionPane.showMessageDialog(null , "D");
                        Pass = 'D';
                    }
                    else{
                        JOptionPane.showMessageDialog(null , "E");
                        Pass = 'E';
                    }
                }
            }

        }
        System.out.println(Pass);
    }
}
