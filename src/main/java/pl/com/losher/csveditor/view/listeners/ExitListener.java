package pl.com.losher.csveditor.view.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author tomasz.kramarczyk
 */
public class ExitListener extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}
