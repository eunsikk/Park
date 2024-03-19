package them.UlsanJava.FinalTerm;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class Exam21 extends JFrame {
    private MyPanel panel = new MyPanel();

    public Exam21() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(250, 220);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10, 10, 50, 50);
            g.drawRect(50, 50, 50, 50);
            g.setColor(Color.MAGENTA);
            g.drawRect(90, 90, 50, 50);
        }
    }

    public static void main(String[] args) {
        new Exam21();
    }
}
