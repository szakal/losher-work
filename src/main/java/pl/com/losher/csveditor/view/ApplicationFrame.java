package pl.com.losher.csveditor.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author tomasz.kramarczyk
 */
public class ApplicationFrame extends JFrame {

    //nie wiem czy to tutaj musi byc... moze to powinno byc jakos ze dodaje sie komponenty
    private JScrollPane scrollPane;

    public void init() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));

        setVisible(true);
        setState(Frame.NORMAL);

        add(scrollPane);
//        show();
        setVisible(true);
    
    }


    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}
