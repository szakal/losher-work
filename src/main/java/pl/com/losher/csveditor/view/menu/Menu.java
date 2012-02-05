package pl.com.losher.csveditor.view.menu;

import javax.swing.*;
import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class Menu extends JMenu {

    private List<JMenuItem> jMenuItemList;

    public void init() {

        for (JMenuItem jMenuItem : jMenuItemList) {
            this.add(jMenuItem);
        }

    }

    public void setjMenuItemList(List<JMenuItem> jMenuItemList) {
        this.jMenuItemList = jMenuItemList;
    }
}
