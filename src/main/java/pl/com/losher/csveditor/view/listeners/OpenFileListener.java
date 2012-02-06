package pl.com.losher.csveditor.view.listeners;

import com.csvreader.CsvReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.com.losher.csveditor.model.Row;
import pl.com.losher.csveditor.service.RowsManager;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pl.com.losher.csveditor.view.table.Table;

/**
 * @author tomasz.kramarczyk
 */
public class OpenFileListener extends AbstractAction implements ActionListener {

    private JFileChooser fileChooser;
    private Component parentComponent;
    private Table table;
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void actionPerformed(ActionEvent e) {

        int returnVal = fileChooser.showOpenDialog(parentComponent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);

                //TODO - wyniesc cale czytanie i konstruowanie listy do jakiejs klasy
                CsvReader csvReader = new CsvReader(fileReader);
                csvReader.setDelimiter('\t');
                csvReader.readHeaders();
                final String[] headers = csvReader.getHeaders();

                List<String[]> rows = new ArrayList<String[]>();
                
                while(csvReader.readRecord()){
                    rows.add(csvReader.getValues());
                }
                
                
//                List<Row> rows = new ArrayList<Row>();

                
//                while (csvReader.readRecord()) {
//                    Row row = new Row();
//                    row.setChrName(csvReader.get("chr_name"));
//                    row.setChrStart(csvReader.get("chr_start"));
//                    row.setChrEnd(csvReader.get("chr_end"));
//                    row.setRefBase(csvReader.get("ref_base"));
//                    row.setAltBase(csvReader.get("alt_base"));
//                    row.setHomHet(csvReader.get("hom_het"));
//                    row.setSnpQuality(csvReader.get("snp_quality"));
//                    row.setToDepth(csvReader.get("tot_depth"));
//                    row.setPercent(csvReader.get("%"));
//                    row.setDbSNP(csvReader.get("dbSNP"));
//                    row.setDbSNP131(csvReader.get("dbSNP131"));
//                    
//
//                    rows.add(row);
//                }

                csvReader.close();
                
                //TODO to sie nie udaje castoawnie, teoretycznie chyba powinno ;). bo mamy 
                String[][] tableData = new String[rows.size()][];
                
                TableModel tableModel= new DefaultTableModel(rows.toArray(tableData), headers);
               
                table.setModel(tableModel); 
               

//                rowsManager.setRows(rows);

                //This is where a real application would open the file.
                log.info("Opening: " + file.getName() + ".");


            } catch (FileNotFoundException e1) {
                log.error("File " + file.getAbsolutePath() + File.pathSeparator + file.getName() + " not found", e);
            } catch (IOException e1) {
                log.error("Error during reading file " + file.getAbsolutePath() + File.pathSeparator + file.getName(), e);
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

    public void setTable(Table table) {
        this.table = table;
    }

    
}
