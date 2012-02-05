package pl.com.losher.csveditor.view.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class MenuBar extends JMenuBar{

    private List<JMenu> menuList;

    public void init() {
        for (JMenu jMenu : menuList) {
            this.add(jMenu);
        }
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }
}
