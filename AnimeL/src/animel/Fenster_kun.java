/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRootPane;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author FlazZixX
 */
public class Fenster_kun extends javax.swing.JFrame {
    static DefaultListModel dir_list;
    /**
     * Creates new form Fenster_kun
     */
    public Fenster_kun() {
        initComponents();
        jBAbsenden.setText(lang_manager.lang[40]);
        Container c = getContentPane();
        c.setBackground(new Color(47,50,56,255));
        jScrollPane1.setVisible(false);
        //jLabel1.setFont(Font.getFont(getClassLoader().getResourceAsStream(resourceName)));
        jLabel1.setText(lang_manager.lang[41]);
        jLabel2.setText(lang_manager.lang[43]);
        jButton1.setText(lang_manager.lang[42]);
        InputStream is = this.getClass().getResourceAsStream("/font/Exo2_Regular.ttf");
        try {
            
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = font.deriveFont(40F);
            jLabel1.setFont(font);
            
        } catch (FontFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAbsenden = new javax.swing.JButton();
        Textpfad = new javax.swing.JTextField(CENTER);
        jScrollPane1 = new javax.swing.JScrollPane();
        dir_list = new DefaultListModel();
        OrdnerListe = new javax.swing.JList(dir_list);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anime Library");
        setBackground(new java.awt.Color(47, 50, 56));

        jBAbsenden.setText("Einstellungen");
        jBAbsenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbsendenActionPerformed(evt);
            }
        });

        Textpfad.setBackground(java.awt.Color.darkGray);
        Textpfad.setForeground(new java.awt.Color(255, 255, 255));
        Textpfad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textpfad.setBorder(null);
        Textpfad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextpfadActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(OrdnerListe);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(java.awt.Color.darkGray);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAbsenden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textpfad)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 364, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAbsenden)
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Textpfad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAbsendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbsendenActionPerformed

    Login l1 = new Login();
    l1.setVisible(true);
    l1.setBounds(100, 100, 1300, 650);
    
    }//GEN-LAST:event_jBAbsendenActionPerformed

    private void TextpfadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextpfadActionPerformed

    jButton1.setVisible(false);
    jLabel1.setVisible(false);
    jLabel2.setVisible(false);
    Textpfad.setVisible(false);
    Component component = (Component) evt.getSource();
                    JFrame frame = (JFrame) SwingUtilities.getRoot(component);
    basic_funktions.add_folder(frame,Textpfad.getText());
  
    }//GEN-LAST:event_TextpfadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser new_path = new JFileChooser(); 
        new_path.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
        int state = new_path.showOpenDialog(null);
        
        if (state == JFileChooser.APPROVE_OPTION) {
        File file = new_path.getSelectedFile();
        Textpfad.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> OrdnerListe;
    public static javax.swing.JTextField Textpfad;
    private javax.swing.JButton jBAbsenden;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
