package pl.com.losher.csveditor.view.menu;

import javax.swing.*;
import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class Menu extends JMenu {

    private List<JMenuItem> menuItems;

    public void init() {
        for (JMenuItem jMenuItem : menuItems) {
            this.add(jMenuItem);
        }
    }

    //ustawiam w springu
    public void setMenuItems(List<JMenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
