package pl.com.losher.csveditor.view;

import pl.com.losher.csveditor.view.model.Row;

import java.util.List;

/**
 * @author tomasz.kramarczyk
 */
public class Change {

    private String[] headers;
    private List<Row> rows;


    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }
}
