/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor =0;
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un dato entero. (Un valor entero positivo):");
            valor = input.nextInt();
            if (valor < 0)
                throw new Exception ("El valor " + valor + " no es una edad valida");
            System.out.println("La edad capturada es:" +  valor);
        } catch (Exception ex) {
        ex.printStackTrace();
        }
        
    }
    
}
