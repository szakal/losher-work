package pl.com.losher.csveditor.view.menu;

import javax.swing.*;
import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class MenuBar extends JMenuBar {

    private List<JMenu> menuList;

    //uruchamiane przez spring
    public void init() {
        for (JMenu jMenu : menuList) {
            this.add(jMenu);
        }
    }

    //ustawiane w springu
    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }
}
