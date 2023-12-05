package JavaProject.MainUi;

import javax.swing.*;
import JavaProject.Item.CharacterSelectionListener;
import java.awt.*;

public class MainFrame extends JFrame {
    private DefaultListModel<String> model;
    private JPanel characterInfoPanel;

    public MainFrame() {
        setTitle("Star Rail CharacterGuide");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container mainFrame = getContentPane();
        mainFrame.setBackground(Color.WHITE);
        mainFrame.setLayout(new BorderLayout(10, 10));

        model = new DefaultListModel<>();
        PropertyPanel propertyPanel = new PropertyPanel(model);
        mainFrame.add(propertyPanel, BorderLayout.NORTH);

        ListScrollPane listScrollPane = new ListScrollPane(model);
        JList<String> list = listScrollPane.getList();
        CharacterSelectionListener selectionListener =
                new CharacterSelectionListener(characterInfoPanel);
        list.addListSelectionListener(selectionListener);
        mainFrame.add(listScrollPane, BorderLayout.WEST);

        ImagePanel bacImagePanel =
                new ImagePanel(getClass().getResource("/PropertyImages/background.png"));
        mainFrame.add(bacImagePanel);

        setSize(900, 700);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
