package JavaProject.EventListener;

import JavaProject.MainUi.ImagePanel;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.net.URL;

public class CharacterSelectionListener implements ListSelectionListener {
    private ImagePanel imagePanel;
    private DefaultListModel<String> model;

    public CharacterSelectionListener(ImagePanel imagePanel, DefaultListModel<String> model) {
        this.imagePanel = imagePanel;
        this.model = model;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            JList<?> list = (JList<?>) e.getSource();
            String selectedValue = (String) list.getSelectedValue();
            updateCharacterImage(selectedValue);
        }
    }

    private void updateCharacterImage(String selectedValue) {
        String imagePath = "/Image/Information/" + selectedValue + "info.png";
        URL imageUrl = getClass().getResource(imagePath);

        if (imageUrl != null) {
            ImageIcon characterIcon = new ImageIcon(imageUrl);
            imagePanel.setCharacterImage(characterIcon);
        }
    }
}
