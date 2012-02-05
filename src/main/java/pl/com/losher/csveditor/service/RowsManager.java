package pl.com.losher.csveditor.service;

import pl.com.losher.csveditor.model.Row;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author tomasz.kramarczyk
 */
public class RowsManager extends Observable {

    private List<Row> rows;
    private List<Observer> observers;

    public void setRows(List<Row> rows) {
        this.rows = rows;

        Change change = new Change();
        change.setRows(rows);

        setChanged();
        notifyObservers(change);
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
        for (Observer observer : observers) {
            this.addObserver(observer);
        }
    }

}
