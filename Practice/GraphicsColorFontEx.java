package Practice;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsColorFontEx() {
        try {
            setTitle("Color, Font 사용 예제");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(panel);
            setSize(350, 470);
            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace(); // 로그 출력
        }
    }
}


class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawString("I Love Java.~~", 30, 30);
            g.setColor(new Color(255, 0, 0));
            g.setFont(new Font("Arial", Font.ITALIC, 30));
            g.drawString("How much?", 30, 60);
            g.setColor(new Color(0x00ff00ff));
            for (int i = 1; i <= 5; i++) {
                g.setFont(new Font("Jokerman", Font.ITALIC, i * 10));
                g.drawString("This much!!", 30, 60 + i * 60);
            }
        } catch (Exception e) {
            e.printStackTrace(); // 로그 출력
        }
    }
}


class Test {
    public static void main(String[] args) {
        System.out.println("애플리케이션 시작...");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    System.out.println("GUI 생성 중...");
                    new GraphicsColorFontEx();
                    System.out.println("GUI 생성 완료.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("main 메서드 종료.");
    }
}
