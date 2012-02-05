package pl.com.losher.csveditor;

import javax.swing.*;

/**
 * @author tomasz.kramarczyk
 */
public class CSVEditor {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Launcher launcher = new Launcher();
        launcher.launch();
    }

}
