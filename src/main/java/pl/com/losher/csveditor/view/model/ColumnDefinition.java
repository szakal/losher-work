package pl.com.losher.csveditor.view.model;

/**
 * @author tomasz.kramarczyk
 */
public enum ColumnDefinition {



    CHR_NAME(0),
    CHR_START(1),
    CHR_END(2),
    REF_BASE(3);

    private int index;

    ColumnDefinition(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public static ColumnDefinition getColumn(int index) {
        for (ColumnDefinition columnDefinition : values()) {
            if (columnDefinition.getIndex() == index) {
                return columnDefinition;
            }
        }
        return null;
    }
}
