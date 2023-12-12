package JavaProject.MainUi;

import javax.swing.*;
import JavaProject.Item.CharacterSelectionListener;
import java.awt.*;

public class MainFrame extends JFrame {
    private DefaultListModel<String> model;
    private ImagePanel backgroundPanel;

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

        // ImagePanel을 backgroundPanel로 이름 변경 및 초기화
        backgroundPanel =
                new ImagePanel(getClass().getResourceAsStream("/PropertyImages/background.png"));
        mainFrame.add(backgroundPanel, BorderLayout.CENTER);

        // CharacterSelectionListener에 backgroundPanel 전달
        CharacterSelectionListener selectionListener =
                new CharacterSelectionListener(backgroundPanel, model);
        list.addListSelectionListener(selectionListener);
        mainFrame.add(listScrollPane, BorderLayout.WEST);

        setSize(900, 700);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
