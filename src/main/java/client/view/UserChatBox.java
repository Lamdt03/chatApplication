package client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserChatBox extends JPanel {
    private JTextArea chatTextArea;
    private JButton closeButton;
    public UserChatBox() {
        setLayout(new BorderLayout());
        chatTextArea = new JTextArea();
        chatTextArea.setEditable(false);
        JScrollPane chatScrollPane = new JScrollPane(chatTextArea);
        closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Remove the chat box from the tabbed pane
                JTabbedPane tabbedPane = (JTabbedPane) getParent();
                tabbedPane.remove(UserChatBox.this);
            }
        });
        add(chatScrollPane, BorderLayout.CENTER);
        add(closeButton, BorderLayout.EAST);
    }

    public JTextArea getChatTextArea() {
        return chatTextArea;
    }
}
