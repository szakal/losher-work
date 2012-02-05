package pl.com.losher.csveditor.view.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author tomasz.kramarczyk
 */
public class ExitListener extends AbstractAction{

    /**
     * Wylacza aplikacje
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO moze jakies okientko "Jestes pewny"??
        System.exit(0);
    }

}
