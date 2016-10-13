package edu.mfldclin.mcrf.vakilabad.common.gui;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Ehsun Behravesh <ehsun.behravesh@openet.com>
 */
public class CommonFrame extends JFrame {

    public CommonFrame() throws HeadlessException {
    }

    public CommonFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public CommonFrame(String title) throws HeadlessException {
        super(title);
    }

    public CommonFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
    public void goToCenterOfScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
}
