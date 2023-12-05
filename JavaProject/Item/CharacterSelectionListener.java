package JavaProject.Item;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CharacterSelectionListener implements ListSelectionListener {
    private JPanel CharacterSelectionPanel;

    public CharacterSelectionListener(JPanel CharacterSelectionPanel) {
        this.CharacterSelectionPanel = CharacterSelectionPanel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            JList<?> list = (JList<?>) e.getSource();
            String selectedValue = (String) list.getSelectedValue();
            updateCharacterSelectionPanel(selectedValue);
        }
    }

    private void updateCharacterSelectionPanel(String selectedValue) {
        // infoPanel 내용 업데이트 로직
        // 예: 캐릭터 이름으로 레이블 생성 및 추가
        CharacterSelectionPanel.removeAll();
        JLabel nameLabel = new JLabel(selectedValue);
        CharacterSelectionPanel.add(nameLabel);
        CharacterSelectionPanel.revalidate();
        CharacterSelectionPanel.repaint();
    
    }
}
