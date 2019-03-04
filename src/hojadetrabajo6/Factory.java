/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
/**
 *
 * @author moyha
 */
public class Factory {
    
    public Map CrearMapa(int a){
        if(a==1){
            Map<String, String> mapa = new HashMap<String, String>();
                return mapa;
        }else if(a==2){
            Map<String, String> mapa = new TreeMap<String, String>();
                return mapa;               
        }else if(a==3){
            Map<String, String> mapa = new LinkedHashMap<String, String>();
            return mapa;
        }
        else{
            return null;
        }
    }
}
