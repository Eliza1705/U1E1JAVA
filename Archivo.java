package ordenar.una.frase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author A Eliza Amaro
 */
public class Archivo {
   String cadena[] = {"Hola", "soy", "elizabeth", "resendiz", "amaro"};  
    
	String[] cadenadesordenada = new String[5];
    
	String[] cadenaordenada = new String[5];
    
  public String Leer()throws FileNotFoundException, IOException{
      File LeerArch = new File("Frase.txt");
        FileReader leer = new FileReader(LeerArch);
        Scanner s = new Scanner(LeerArch);
        String leebfread;
        int cont = 0;
    
    
        while (s.hasNext()) { 
            cadenadesordenada[cont] = s.nextLine(); 
            cont++; 
        }
        
        System.out.println("****************Frase desordenada*****************");
        for (int i = 0; i <= cadenadesordenada.length - 1; i++) {
             System.out.println(cadenadesordenada[i]);

        }
        String ruta=leer.toString();
        return ruta;
    }

    public void Comparar() {

        for (int x = 0; x <= cadena.length - 1; x++) {
            for (int i = 0; i <= cadenadesordenada.length - 1; i++) {
                if (cadena[x].equals(cadenadesordenada[i])) {
                    cadenaordenada[x] = cadenadesordenada[i];
                }
            }
        }
        System.out.println();
        for (int x = 0; x <= cadenaordenada.length - 1; x++) {

        }
    }
  }
