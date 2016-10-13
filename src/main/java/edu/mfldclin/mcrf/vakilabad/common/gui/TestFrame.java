/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mfldclin.mcrf.vakilabad.common.gui;

import java.awt.HeadlessException;

/**
 *
 * @author Ehsun Behravesh <ehsun.behravesh@openet.com>
 */
public class TestFrame extends CommonFrame {

    public TestFrame() throws HeadlessException {
        super("Test frame at center");
        setSize(500, 700);
        goToCenterOfScreen();
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new TestFrame();
    }
}
