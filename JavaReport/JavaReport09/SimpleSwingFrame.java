package JavaReport09;

import java.awt.*;
import javax.swing.*;

public class SimpleSwingFrame extends JFrame {
    public SimpleSwingFrame() {
        super("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPane1(), BorderLayout.NORTH);
        c.add(new CenterPane1(), BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    class NorthPane1 extends JPanel {
        public NorthPane1() {
            setBackground(Color.LIGHT_GRAY);
            setLayout(new FlowLayout());
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    class CenterPane1 extends JPanel {
        public CenterPane1() {
            setLayout(null);

            JLabel a = new JLabel("Hello");
            a.setSize(100, 20);
            a.setLocation(100, 10);

            JLabel b = new JLabel("Java");
            b.setSize(100, 20);
            b.setLocation(20, 150);

            JLabel c = new JLabel("Love");
            c.setSize(100, 20);
            c.setLocation(200, 120);

            add(a);
            add(b);
            add(c);
        }
    }

    public static void main(String[] args) {
        new SimpleSwingFrame();
    }
}
