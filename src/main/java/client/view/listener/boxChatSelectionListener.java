package client.view.listener;

import client.view.UserChatBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static client.view.HomePage.*;


public class boxChatSelectionListener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        // Get the selected friend name
        String selectedFriendName = friendList.getSelectedValue();

        // Check if a tab for the selected friend already exists
        for (int i = 0; i < chatTabbedPane.getTabCount(); i++) {
            if (chatTabbedPane.getTitleAt(i).equals(selectedFriendName)) {
                // If a tab already exists, select it
                chatTabbedPane.setSelectedIndex(i);
                return;
            }
        }

        // If a tab doesn't exist, create a new tab and add the chat box for the selected friend
        UserChatBox chatBox = new UserChatBox();
        chatTabbedPane.addTab(selectedFriendName, chatBox);
        chatTabbedPane.setSelectedComponent(chatBox);

    }
}
