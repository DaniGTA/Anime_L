/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Daniel
 */
public class AnimeL {
    static JFrame frame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        frame = new JFrame("Test");
//		  frame.setVisible(false);
//                  frame.setMinimumSize(new Dimension(1300,450));
//		  frame.setBounds(100, 100, 1300, 650);
//		  frame.getContentPane().setLayout(null);
//		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                  frame.setVisible(true);
    lang_manager.lang_cache="ger";
    lang_manager.int_lang();
    Fenster_kun f1 = new Fenster_kun();
    f1.setVisible(true);
    f1.setBounds(100, 100, 1300, 650);

    }
    
}