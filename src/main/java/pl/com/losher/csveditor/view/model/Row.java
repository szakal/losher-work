package pl.com.losher.csveditor.view.model;

/**
 * @author tomasz.kramarczyk
 */
public class Row {

    private String chrName;
    private String chrStart;
    private String dbSNP131;
    private String chrEnd;
    private String refBase;
    private String altBase;
    private String homHet;
    private String snpQuality;
    private String toDepth;
    private String persentage;
    private String dbSNP;

    public String getChrName() {
        return chrName;
    }

    public void setChrName(String chrName) {
        this.chrName = chrName;
    }

    public String getChrStart() {
        return chrStart;
    }

    public void setChrStart(String chrStart) {
        this.chrStart = chrStart;
    }

    public void setChrEnd(String chrEnd) {
        this.chrEnd = chrEnd;
    }

    public void setRefBase(String refBase) {
        this.refBase = refBase;
    }

    public void setAltBase(String altBase) {
        this.altBase = altBase;
    }

    public void setHomHet(String homHet) {
        this.homHet = homHet;
    }

    public void setSnpQuality(String snpQuality) {
        this.snpQuality = snpQuality;
    }

    public void setToDepth(String toDepth) {
        this.toDepth = toDepth;
    }

    public void setPercent(String persentage) {
        this.setPersentage(persentage);
    }

    public void setDbSNP(String dbSNP) {
        this.dbSNP = dbSNP;
    }

    public void setDbSNP131(String dbSNP131) {
        this.dbSNP131 = dbSNP131;
    }

    public String getDbSNP131() {
        return dbSNP131;
    }

    public String getChrEnd() {
        return chrEnd;
    }

    public String getRefBase() {
        return refBase;
    }

    public String getAltBase() {
        return altBase;
    }

    public String getHomHet() {
        return homHet;
    }

    public String getSnpQuality() {
        return snpQuality;
    }

    public String getToDepth() {
        return toDepth;
    }

    public String getPersentage() {
        return persentage;
    }

    public void setPersentage(String persentage) {
        this.persentage = persentage;
    }

    public String getDbSNP() {
        return dbSNP;
    }


    public Object getColumnValue(ColumnDefinition columnDefinition) {

        switch (columnDefinition) {
            case CHR_NAME:
                return this.chrName;
            case CHR_END:
                return this.chrEnd;
            case CHR_START:
                return this.chrStart;
            case REF_BASE:
                return this.refBase;
        }

        return "";
    }
}
