package edu.mfldclin.mcrf.vakilabad.data.dataset.arff;

import java.util.List;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
public class NominalAttribute extends Attribute {
    protected List<String> nominals;

    public NominalAttribute() {
    }

    public NominalAttribute(List<String> nominals, String name) {
        super(name);
        this.nominals = nominals;
    }

    public NominalAttribute(List<String> nominals) {
        this.nominals = nominals;
    }
    
    public List<String> getNominals() {
        return nominals;
    }

    public void setNominals(List<String> nominals) {
        this.nominals = nominals;
    }
    
    
}
