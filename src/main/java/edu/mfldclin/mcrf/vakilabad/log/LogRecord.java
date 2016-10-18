package edu.mfldclin.mcrf.vakilabad.log;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
public class LogRecord {
    protected String value;

    public LogRecord() {
    }

    public LogRecord(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }    
}
