/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.io.File;

/**
 *
 * @author Daniel
 */
public class io_manager {
    
    public void get_files(){


}
    public String[] file_listing(String path){
        File file = new File(path);
        String[] file_2 =file.list();
       
        return file_2;
    }
}

