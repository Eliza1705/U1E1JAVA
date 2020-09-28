package ordenar.una.frase;

/**
 *
 * @author A Eliza Amaro
 */
import java.io.IOException;

import javax.swing.JOptionPane;
public class Procesos {
    public void procesos() {
	    Archivo obj = new Archivo();
            try {
                if (obj.Leer()!="") 
            {
                    obj.Comparar();
              }else{ JOptionPane.showMessageDialog(null, "No se a recibido ningun archivo");}
            } catch (IOException ex) {	 	
            }
           
            String frase = " ";
            for (int i = 0; i <= obj.cadenaordenada.length - 1; i++) {
                frase = frase + obj.cadenaordenada[i] + " ";        
            }
            
            System.out.println("**************Frase ordenada********************");
            System.out.print(frase);
	}
    
}
