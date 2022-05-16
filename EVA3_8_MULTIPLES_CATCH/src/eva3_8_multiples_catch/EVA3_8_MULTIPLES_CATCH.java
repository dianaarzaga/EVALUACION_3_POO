/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class EVA3_8_MULTIPLES_CATCH {

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
        }catch(ArithmeticException e){
            //e.printStackTrace(); //imprime la excepcion sin que el programa se detenga 
            System.out.println("Se produjo una division entre cero");
        }catch (InputMismatchException r){
            System.out.println("El valor capturado no es un numero valido");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
