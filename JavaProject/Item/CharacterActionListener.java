package JavaProject.Item;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterActionListener implements ActionListener {
    private DefaultListModel<String> model;

    public CharacterActionListener(DefaultListModel<String> model) {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.clear();
        if ("화염".equals(e.getActionCommand())) {
            model.addElement("4⭐아스타");
            model.addElement("5⭐토파즈");
        } else if ("얼음".equals(e.getActionCommand())) {
            model.addElement("5⭐경류");
            model.addElement("5⭐연경");
            model.addElement("5⭐게파드");
            model.addElement("5⭐March 7th");
        } else if ("허수".equals(e.getActionCommand())) {
            model.addElement("5⭐음월");
            model.addElement("5⭐나찰");
            model.addElement("5⭐웰트");
            model.addElement("5⭐어공");
        } else if ("물리".equals(e.getActionCommand())) {
            model.addElement("5⭐클라라");
            model.addElement("4⭐나타샤");
        } else if ("양자".equals(e.getActionCommand())) {
            model.addElement("5⭐부현");
            model.addElement("5⭐제레");
            model.addElement("5⭐은랑");
        } else if ("번개".equals(e.getActionCommand())) {
            model.addElement("5⭐백로");
            model.addElement("5⭐경원");
            model.addElement("5⭐카프카");
            model.addElement("4⭐정운");
        } else if ("바람".equals(e.getActionCommand())) {
            model.addElement("5⭐곽향");
            model.addElement("5⭐블레이드");
            model.addElement("5⭐브로냐");
        }
    }
}
