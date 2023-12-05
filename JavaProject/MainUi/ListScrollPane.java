package JavaProject.MainUi;


import javax.swing.*;
import java.awt.*;

public class ListScrollPane extends JScrollPane {
    private JList<String> list;

    public ListScrollPane(DefaultListModel<String> model) {
        list = new JList<>(model);
        Font listFont = new Font("Dialog", Font.BOLD, 15);
        list.setCellRenderer(new FontChange(listFont));
        setViewportView(list);
        setPreferredSize(new Dimension(111, 100));
        setBorder(BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLACK));
    }

    public JList<String> getList() {
        return list;
    }
}
