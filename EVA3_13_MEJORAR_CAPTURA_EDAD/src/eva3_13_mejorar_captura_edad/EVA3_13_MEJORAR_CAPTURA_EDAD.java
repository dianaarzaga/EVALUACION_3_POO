/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean Error = true; //el usuario siempre se equivoca
        Scanner input = new Scanner(System.in);
        do {
            try {

                System.out.println("Introduce tu edad (numero entero):");
                int iedad = input.nextInt();
                if (iedad < 0) {
                    throw new Exception("El valor " + iedad + " no es una edad valida");
                }
                System.out.println("Tu edad edad: " + iedad);
                Error = false;
            } catch (InputMismatchException e) {
                System.out.println( input.next () + "No es un nuero valido");
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Edad no valida");
            }

        } while (Error);

    }

}
