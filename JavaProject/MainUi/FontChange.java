package JavaProject.MainUi;


import javax.swing.*;
import java.awt.*;

public class FontChange extends DefaultListCellRenderer {
    private Font font;

    public FontChange(Font font) {
        this.font = font;
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        Component renderer =
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        renderer.setFont(font);
        return renderer;
    }
}
