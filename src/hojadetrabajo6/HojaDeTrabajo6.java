/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
/**
 *
 * @author moyha
 */
public class HojaDeTrabajo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String line = null;
        String key;
        String value = "e";
        int op;
        boolean NUKE = false;
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Factory fact = new Factory();
        Map<String, String> mapa;
        Map<String, String> usuarioMapa;
        Map<String, Integer> cantMapa;
        Menu menu = new Menu();
        menu.PrintMenu();
        op = scan.nextInt();
        mapa = fact.CrearMapa(op);
        usuarioMapa = fact.CrearMapa(op);
        cantMapa = fact.CrearMapa(op);
        try{
                FileReader fileReader = new FileReader("cards_desc.txt");

                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null) {                          
                    key = line.substring(0, line.indexOf('|'));                   
                    value = line.substring(line.lastIndexOf("|") + 1);
                    mapa.put(key, value);                  
                } 
                bufferedReader.close(); 
                System.out.println(mapa.get("8-Claws Scorpion"));
                while(!NUKE){
                menu.PrintMenu2();
                try{
                    op = scan.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                key = scan.nextLine();
                switch(op){
                    case 1:
                        System.out.println("Ingrese el nombre de la carta que quiere agregar.");                        
                        key = scan.nextLine();
                        if(mapa.containsKey(key)){
                            value = mapa.get(key);
                            usuarioMapa.put(key, value); 
                            if(cantMapa.containsKey(key)){
                                int i = cantMapa.get(key) + 1;
                                cantMapa.put(key, i); 
                            }
                            else{
                                cantMapa.put(key, 1);
                            }      
                            System.out.println(cantMapa.get(key));
                        }else{
                            System.out.println("Fuck off");
                        }
                    break;
                    case 2:
                        System.out.println("Ingrese el nombre de la carta que quiere agregar.");                        
                        key = scan.nextLine();
                        if(mapa.containsKey(key)){
                            System.out.println("La carta es de tipo: " + mapa.get(key));
                        }else{
                            System.out.println("Fuck off");
                        }
                    break;
                    case 3:
                        for(String e: usuarioMapa.keySet()){
                            System.out.println(e + "|" + usuarioMapa.get(e) + "|" + cantMapa.get(e));
                        }
                        break;
                    case 4:
                        for(String e: usuarioMapa.keySet()){
                            if(usuarioMapa.get(e).equals("Monstruo")){
                                System.out.println(e + "|" + usuarioMapa.get(e) + "|" + cantMapa.get(e));
                            }
                        }
                        for(String e: usuarioMapa.keySet()){
                            if(usuarioMapa.get(e).equals("Hechizo")){
                                System.out.println(e + "|" + usuarioMapa.get(e) + "|" + cantMapa.get(e));
                            }
                        }
                        for(String e: usuarioMapa.keySet()){
                            if(usuarioMapa.get(e).equals("Trampa")){
                                System.out.println(e + "|" + usuarioMapa.get(e) + "|" + cantMapa.get(e));
                            }
                        }
                        break;
                    case 5:
                        for(String e: mapa.keySet()){
                            System.out.println(e + "|" + mapa.get(e));
                        }
                        break;
                    case 6:
                        for(String e: mapa.keySet()){
                            if(mapa.get(e).equals("Monstruo")){
                                System.out.println(e + "|" + mapa.get(e));
                            }
                        }
                        for(String e: mapa.keySet()){
                            if(mapa.get(e).equals("Hechizo")){
                                System.out.println(e + "|" + mapa.get(e));
                            }
                        }
                        for(String e: mapa.keySet()){
                            if(mapa.get(e).equals("Trampa")){
                                System.out.println(e + "|" + mapa.get(e));
                            }
                        }
                        break;    
                    case 7:
                        NUKE = true;
                    break;
                    default:
                        System.out.println("Eso no se puede hacer.");
                }
                }
                scan.close();
                
            }
            catch(FileNotFoundException ex) {
                System.out.println(
                    "Unable to open file '" + "cards_desc.txt" + "'");                
            }
            catch(IOException ex) {
                    System.out.println("Error reading file '" + "cards_desc.txt" + "'");                  
                    // Or we could just do this: 
                    // ex.printStackTrace();
                }
    }


    }
    

