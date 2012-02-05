package pl.com.losher.csveditor.view.menu;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author tomasz.kramarczyk
 */
public class MenuItem extends JMenuItem {

    private ActionListener actionListener;

    public void init() {
        this.addActionListener(actionListener);
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
}
