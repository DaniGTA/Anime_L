/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animel;

/**
 *
 * @author Daniel
 */
public class lang_manager {
    static String[] lang=new String[100];
    static String lang_cache;
    public static void int_lang(){
    if(lang_cache.isEmpty()){
    set_lang("ger");
    }else{
    set_lang(lang_cache);
    }
    }
    public static void set_lang(String lang){
    System.out.println("Sprache gesetzt auf: "+lang);
    if(lang.equals("ger")){
    lang_manager.lang[0]="ger";
    //40-49 FensterKun
    lang_manager.lang[40] = "Einloggen";
    lang_manager.lang[41] = "Wähle deinen Anime Ordner";
    lang_manager.lang[42] = "Ordner wählen";
    lang_manager.lang[43] = "oder füg den Pfad ein";
    //50-60 Login
    lang_manager.lang[50] = "Login Fehlgeschlagen";
    lang_manager.lang[51] = "Benutzername";
    lang_manager.lang[52] = "Passwort";
    lang_manager.lang[53] = "Einloggen";
    lang_manager.lang[54] = "";
    lang_manager.lang[55] = "";
    lang_manager.lang[56] = "";
    lang_manager.lang[57] = "";
    lang_manager.lang[58] = "";
    lang_manager.lang[59] = "";
    lang_manager.lang[60] = "";
    }else if(lang.equals("andereSpracheLikeRUFRODERSo")){
    
    }else{
    //English
    lang_manager.lang[0]="eng";
    //40-49 FensterKun
    lang_manager.lang[40] = "MyAnimeList Login";
    //50-60 MyAnimeList Login
    lang_manager.lang[50] = "Login Failed"; //Dafür gibt es 100% eine besser Übersetzung
    lang_manager.lang[51] = "Username";
    lang_manager.lang[52] = "Password";
    lang_manager.lang[53] = "Login";
    lang_manager.lang[54] = "";
    lang_manager.lang[55] = "";
    lang_manager.lang[56] = "";
    lang_manager.lang[57] = "";
    lang_manager.lang[58] = "";
    lang_manager.lang[59] = "";
    lang_manager.lang[60] = "";
    }
    }
}
