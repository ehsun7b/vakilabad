package edu.mfldclin.mcrf.vakilabad.data.dataset.arff;

import java.text.SimpleDateFormat;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
public class DateAttribute extends Attribute {
    
    protected SimpleDateFormat dateFormat;    

    public DateAttribute() {
    }

    public DateAttribute(SimpleDateFormat dateFormat, String name) {
        super(name);
        this.dateFormat = dateFormat;
    }
    
    public DateAttribute(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
    
    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }    
}
