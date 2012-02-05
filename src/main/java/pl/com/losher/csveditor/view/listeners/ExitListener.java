package pl.com.losher.csveditor.view.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * //TODO fajnie jakby ten event odpalal sie tez po kliknieciu w "x" w prawym gornym.
 *
 * @author tomasz.kramarczyk
 */
public class ExitListener extends AbstractAction {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Wylacza aplikacje
     *
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO moze jakies okientko "Jestes pewny"??
        log.info("Application is getting to shutdown...");
        System.exit(0);

    }

}
