package JavaProject.MainUi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class ImagePanel extends JPanel {
    private BufferedImage background;
    private ImageIcon characterImage;

    public ImagePanel(InputStream inputStream) {
        try {
            background = ImageIO.read(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCharacterImage(ImageIcon newCharacterImage) {
        Image scaledCharacterImage = newCharacterImage.getImage().getScaledInstance(
                background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        this.characterImage = new ImageIcon(scaledCharacterImage);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // 렌더링 품질을 향상시키기 위한 설정
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 배경 이미지 그리기
        if (background != null) {
            g2d.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
        }

        // 캐릭터 이미지 그리기
        if (characterImage != null) {
            g2d.drawImage(characterImage.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        }

        g2d.dispose(); // 그래픽스 객체 정리
    }
}
