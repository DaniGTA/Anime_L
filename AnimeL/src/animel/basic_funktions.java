/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import static animel.Fenster_kun.Textpfad;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel
 */
public class basic_funktions {
    static JButton[] button;
     public static String get_between(String entry,String entry_2,String line){
      Pattern p = Pattern.compile(entry+"(.*?)"+entry_2);
      Matcher m = p.matcher(line);
      if (m.find()) {
      return m.group(1);
      }
      return null;
    }
public static void add_folder(JFrame a,String pfad){
  
              String[]dani = io_manager.file_listing(pfad);
              button = new JButton[dani.length+1];
              int x_1=100;
              int y_1=100;
              int x_2=100;
              int y_2=100;
              int x=0;
        for(String text:dani){
            System.out.println(text);
            text=Textpfad.getText()+File.separator+text;
                try{
                    if(x==0){
                        String pattern = Pattern.quote(File.separator);
                        String[] path_split = Textpfad.getText().split(pattern);
                        int length=path_split.length-1;
                        int  x_2_lengt=0;
                        String pre_path="";
                        for(String path_split_process:path_split){
                            System.out.println("DEBUG: "+path_split_process);
                        if(x_2_lengt<length) {
                            if(x_2_lengt==0){
                            pre_path=path_split_process;
                            }else{
                            pre_path+=File.separator+path_split_process;
                            }
                        x_2_lengt++;
                        }
                        }
                        System.out.println("Path back: "+pre_path);
                        InputStream is = a.getClass().getResourceAsStream("/img/back.png");
                        Image img = ImageIO.read(is);
                        Image newimg = img.getScaledInstance(100, 100,java.awt.Image.SCALE_SMOOTH);
                        button[x] = new JButton();
                        button[x].setIcon(new ImageIcon(newimg));
                        button[x].setText(pre_path);
                        button[x].setBounds(x_1,y_1,x_2,y_2);
                        button[x].setBorder(BorderFactory.createEmptyBorder());
                        button[x].setBackground(new Color(0, 255, 0, 0));
                        a.add(button[x]);
                        button[x].setVisible(false);
                        button[x].setVisible(true);
                        button[x].addActionListener(new ActionListener(){      
                        @Override
                                public void actionPerformed(ActionEvent arg0) {    
                                    JButton button = (JButton) arg0.getSource();
                                    Component component = (Component) arg0.getSource();
                                    JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                                    Textpfad.setText(button.getText());
                                    System.out.println("Enter folder:"+button.getText());
                                    basic_funktions.button[0].setVisible(false);
                                   int x=0;
                                   while(basic_funktions.button.length>x){
                                    basic_funktions.button[x].setVisible(false);
                                    x++;
                                   }
                                   add_folder(frame,button.getText());
                                }               
                                });
                        x++;
                        x_1=x_1+150;
                    }
                    
                    if(new File(text).isDirectory()){
                InputStream is = a.getClass().getResourceAsStream("/img/folder.png");
                Image img = ImageIO.read(is);
                Image newimg = img.getScaledInstance(100, 100,java.awt.Image.SCALE_SMOOTH);
                button[x] = new JButton();
                button[x].setIcon(new ImageIcon(newimg));
                button[x].setText(text);
                button[x].setBounds(x_1,y_1,x_2,y_2);
                button[x].setBorder(BorderFactory.createEmptyBorder());
                button[x].setBackground(new Color(0, 255, 0, 0));
                a.add(button[x]);
                button[x].setVisible(false);
                button[x].setVisible(true);
                button[x].addActionListener(new ActionListener(){
                    
                @Override
                
                public void actionPerformed(ActionEvent arg0) {
                    
                    JButton button = (JButton) arg0.getSource();
                    Component component = (Component) arg0.getSource();
                    JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                    Textpfad.setText(button.getText());
                    System.out.println("Enter folder:"+button.getText());
                    basic_funktions.button[0].setVisible(false);
                    
                   int x=0;
                   while(basic_funktions.button.length>x){
                    basic_funktions.button[x].setVisible(false);
                    x++;
                   }
                   add_folder(frame,button.getText());
                }               
                });
                    }else{
                    if(io_manager.is_movie(text)){
                InputStream is = a.getClass().getResourceAsStream("/img/movie.png");
                //URL imgURL = this.getClass().getResource("/img/folder.ico");
                Image img = ImageIO.read(is);
                Image newimg = img.getScaledInstance(100, 100,java.awt.Image.SCALE_SMOOTH);
                button[x] = new JButton();
                button[x].setIcon(new ImageIcon(newimg));
                button[x].setText(text);
                button[x].setBounds(x_1,y_1,x_2,y_2);
                button[x].setBorder(BorderFactory.createEmptyBorder());
                button[x].setBackground(new Color(0, 255, 0, 0));
                a.add(button[x]);
                button[x].setVisible(false);
                button[x].setVisible(true);
                button[x].addActionListener(new ActionListener(){              
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    JButton button = (JButton) arg0.getSource();
                    
                    try {
                        Desktop.getDesktop().open(new File(button.getText()));
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
                });
                }
                    }
  }catch(IOException e){
  System.out.println(e);}
            System.out.println(x+" Ordner wurden bereits hinzugefügt");
                x++;
            x_1=x_1+150;
            if(x_1==1300){
            x_1=100;
            y_1=y_1+150;
            }
            System.out.println("DEBUG: "+x_1);
        }
}
}

