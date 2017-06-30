/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class io_manager {
    
    public static void get_files(){


}
    public static String[] file_listing(String path){
        File file = new File(path);
        return file.list();
    }
    
    public static String[] dir_listing(String path){
        List<String> dir_list = new ArrayList<String>();
        File file = new File(path);
        for(String file_3:file.list()){
        File file_4=new File(path+File.separator +file_3);
        if(file_4.isDirectory()){
        dir_list.add(path+File.separator +file_3);
        }
        }
        String[] file_2 = new String[dir_list.size()];
        return dir_list.toArray(file_2);
    }
    public static boolean is_movie(String path){
    String file=path.substring(path.length()-3);
    System.out.println("DEBUG: "+file);
    switch(file){
    case "mkv":
    return true;
    case "mp4":
    return true;
    case "amv":
    return true;
    case "mov":
    return true;
    case "avi":
    return true;
    //NeedToSupportMore
    default:
    return false;
    }
    }
    }


