/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class EVA3_9_CLASE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        //---------------
        try{
            System.out.println("Introduce un numero entero 1:");
        int entero = input.nextInt();
        System.out.println("Introduce un numero entero 2:");
        int entero2 = input.nextInt();
            System.out.println("Division: " + (entero/entero2));
        }catch(Exception e){
            e.printStackTrace();
        
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
