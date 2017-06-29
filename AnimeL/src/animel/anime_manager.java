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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Daniel
 */
public class anime_manager {
    public static String[][] get_info(String datei_name,String username,String password){   
        String[][] anime_info= new String [100][20];
        //String datei_name,String username,String password
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
                if(con.getResponseCode()==401){
                System.out.println("Einloggen Fehlgeschlagen");
                String[][] n= {{"error"},{"401"}};
                    return n;
                }
                      InputStream is_2 = null;
                      BufferedReader br_2;
                        String line_2;
                        is_2 =con.getInputStream(); 
                      
                      br_2 = new BufferedReader(new InputStreamReader(is_2));
                          System.out.println("start");
                          
                          int x=0;
                      while ((line_2 = br_2.readLine()) != null) {
                          if(line_2.equals("<entry>")){
                            
                          x++;
                          }
                          if(line_2.equals("<id>")){
                              anime_info[x][1]= get_between("<id>","</id>",line_2);
                          }
                          if(line_2.equals("<title>")){
                              anime_info[x][2]= get_between("<title>","</title>",line_2);
                          }
                          if(line_2.equals("<english>")){
                              anime_info[x][3]= get_between("<english>","</english>",line_2);
                          }
                          if(line_2.equals("<synonyms>")){
                              anime_info[x][4]= get_between("<synonyms>","</synonyms>",line_2);
                          }
                          if(line_2.equals("<episodes>")){
                              anime_info[x][5]= get_between("<episodes>","</episodes>",line_2);
                          }
                          if(line_2.equals("<type>")){
                              anime_info[x][6]= get_between("<type>","</type>",line_2);
                          }
                          if(line_2.equals("<status>")){
                              anime_info[x][7]= get_between("<status>","</status>",line_2);
                          }
                          if(line_2.equals("<start_date>")){
                              anime_info[x][8]= get_between("<start_date>","</start_date>",line_2);
                          }
                          if(line_2.equals("<end_date>")){
                              anime_info[x][9]= get_between("<end_date>","</end_date>",line_2);
                          }
                          if(line_2.equals("<synopsis>")){
                              anime_info[x][10]= get_between("<synopsis>","</synopsis>",line_2);
                          }
                          if(line_2.equals("<image>")){
                              anime_info[x][11]= get_between("<image>","</image>",line_2);
                          }
                      }
                        }catch(IOException e){
                        System.out.println(e);
                        }
                      return anime_info;
                      }
    public static String get_between(String entry,String entry_2,String line){
      Pattern p = Pattern.compile(entry+"(.*?)"+entry_2);
      Matcher m = p.matcher(line);
      if (m.find()) {
      return m.group(1);
      }
      return null;
    }
    
    

    }

