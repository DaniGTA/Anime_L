/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class io_manager {
    
    public void get_files(){


}
    public static String[] file_listing(String path){
        File file = new File(path);
        String[] file_2 =file.list();
       
        
        return file_2;
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
        file_2 = dir_list.toArray(file_2);
        return file_2;
    }
}

