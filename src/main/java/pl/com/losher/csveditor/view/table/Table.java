package pl.com.losher.csveditor.view.table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import pl.com.losher.csveditor.service.Change;
import pl.com.losher.csveditor.model.ColumnDefinition;
import pl.com.losher.csveditor.model.Row;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.Observable;
import java.util.Observer;

/**
 * @author tomasz.kramarczyk
 * //TODO na razie ta klasa jest zrabana...
 */
public class Table extends JTable implements Observer {


    private final Log log = LogFactory.getLog(this.getClass());


    public void init() {
        JTableHeader jTableHeader = new JTableHeader();
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Zostale poinformowany!!!!");
        log.error("Zostalem poinformowany o zmianie stanu!!!");

        final Change change = (Change) arg;

        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            @Override
            public int getRowCount() {
                return change.getRows().size();
            }

            @Override
            public int getColumnCount() {
                return ColumnDefinition.values().length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Row row = change.getRows().get(rowIndex);
                ColumnDefinition columnDefinition = ColumnDefinition.getColumn(columnIndex);
                if (columnDefinition != null) {
                    return row.getColumnValue(columnDefinition);
                } else {
                    return "";
                }
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }
        };

        defaultTableModel.setColumnIdentifiers(ColumnDefinition.values());

        this.setModel(defaultTableModel);


    }


}
