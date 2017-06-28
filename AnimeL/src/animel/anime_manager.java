/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Daniel
 */
public class anime_manager {
    public static String[] get_info(String datei_name,String username,String password){   
    try{
    URL url_2;
                      url_2 = new URL("https://myanimelist.net/api/anime/search.xml?q="+datei_name);
                      String authStr = username + ":" + password;   
                      String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
                      HttpsURLConnection con = (HttpsURLConnection)url_2.openConnection();
                      // Acts like a browser
                      con.setUseCaches(false);
                      con.setRequestProperty("User-Agent", "Mozilla/5.0");
                      con.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                      con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
                      con.setRequestProperty  ("Authorization", "Basic " + authEncoded);
                      con.setDoOutput(true);
                      con.setDoInput(true);
                
                      InputStream is_2 = null;
                      BufferedReader br_2;
                        String line_2;
                        is_2 =con.getInputStream(); 
                      
                      br_2 = new BufferedReader(new InputStreamReader(is_2));

                      while ((line_2 = br_2.readLine()) != null) {
                          System.out.println(line_2);
                      }
                        }catch(IOException e){}
                        String[] n={"empty"};
                      return n;
                      }

    }

