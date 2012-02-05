package pl.com.losher.csveditor.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import pl.com.losher.csveditor.view.model.Row;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author tomasz.kramarczyk
 */
public class RowsManager extends Observable{

    private List<Row> rows;
    private List<Observer> observers;

    private final Log log = LogFactory.getLog(this.getClass());
    private String[] headers;

    public void setRows(List<Row> rows) {
        this.rows = rows;

        Change change = new Change();
        change.setHeaders(headers);
        change.setRows(rows);

        setChanged();
        notifyObservers(change);
    }

    public List<Row> getRows() {
        return rows;
    }


    public void setObservers(List<Observer> observers) {
        this.observers = observers;
        for (Observer observer : observers) {
            this.addObserver(observer);
        }
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

}