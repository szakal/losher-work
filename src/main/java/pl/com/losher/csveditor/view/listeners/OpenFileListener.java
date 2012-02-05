package pl.com.losher.csveditor.view.listeners;

import com.csvreader.CsvReader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import pl.com.losher.csveditor.view.RowsManager;
import pl.com.losher.csveditor.view.model.Row;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class OpenFileListener extends AbstractAction implements ActionListener {

    private JFileChooser fileChooser;
    private Component parentComponent;
    private RowsManager rowsManager;

    private final Log log = LogFactory.getLog(this.getClass());


    @Override
    public void actionPerformed(ActionEvent e) {

        int returnVal = fileChooser.showOpenDialog(parentComponent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);


                CsvReader csvReader = new CsvReader(fileReader);
                csvReader.setDelimiter('\t');
                boolean b = csvReader.readHeaders();

                String[] headers = csvReader.getHeaders();
                rowsManager.setHeaders(headers);


                List<Row> rows = new ArrayList<Row>();

                while (csvReader.readRecord()) {
                    Row row = new Row();
                    row.setChrName(csvReader.get("chr_name"));
                    row.setChrStart(csvReader.get("chr_start"));
                    row.setChrEnd(csvReader.get("chr_end"));
                    row.setRefBase(csvReader.get("ref_base"));
                    row.setAltBase(csvReader.get("alt_base"));
                    row.setHomHet(csvReader.get("hom_het"));
                    row.setSnpQuality(csvReader.get("snp_quality"));
                    row.setToDepth(csvReader.get("tot_depth"));
                    row.setPercent(csvReader.get("%"));
                    row.setDbSNP(csvReader.get("dbSNP"));
                    row.setDbSNP131(csvReader.get("dbSNP131"));

                    rows.add(row);
                }

                csvReader.close();

                rowsManager.setRows(rows);

                //This is where a real application would open the file.
                log.info("Opening: " + file.getName() + ".");


            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        } else {
            log.info("Open command cancelled by user.");
        }
    }


    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    public void setParentComponent(Component parentComponent) {
        this.parentComponent = parentComponent;
    }

    public void setRowsManager(RowsManager rowsManager) {
        this.rowsManager = rowsManager;
    }
}
