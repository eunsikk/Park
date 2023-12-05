package JavaProject.MainUi;

import JavaProject.Item.CharacterActionListener;
import javax.swing.*;
import java.awt.*;

public class PropertyPanel extends JPanel {
    private DefaultListModel<String> model;

    public PropertyPanel(DefaultListModel<String> model) {
        this.model = model;
        setLayout(new GridLayout(1, 7, 10, 10));
        String[] properties = {"화염", "얼음", "허수", "물리", "양자", "번개", "바람"};
        for (String property : properties) {
            JButton button = new JButton(property,
                    createScaledIcon("/PropertyImages/" + property.toLowerCase() + ".png", 50, 50));
            button.setActionCommand(property);
            button.addActionListener(new CharacterActionListener(model));
            this.add(button);
        }
    }

    private ImageIcon createScaledIcon(String path, int width, int height) {
        Image image = new ImageIcon(getClass().getResource(path)).getImage();
        return new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
}
