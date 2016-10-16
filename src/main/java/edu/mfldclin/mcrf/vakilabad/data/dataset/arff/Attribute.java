package edu.mfldclin.mcrf.vakilabad.data.dataset.arff;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
public abstract class Attribute {
    
    protected String name;

    public Attribute() {
    }

    public Attribute(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}
