/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel
 */
public class basic_funktions {
     public static String get_between(String entry,String entry_2,String line){
      Pattern p = Pattern.compile(entry+"(.*?)"+entry_2);
      Matcher m = p.matcher(line);
      if (m.find()) {
      return m.group(1);
      }
      return null;
    }
}
