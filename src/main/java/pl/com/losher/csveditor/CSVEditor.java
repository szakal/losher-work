package pl.com.losher.csveditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

/**
 * @author tomasz.kramarczyk
 */
public class CSVEditor {

    private static final Logger log = LoggerFactory.getLogger(CSVEditor.class);

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            log.error("Error during setting Look And Feel", e);
        }

        Launcher launcher = new Launcher();
        launcher.launch();
    }

}
