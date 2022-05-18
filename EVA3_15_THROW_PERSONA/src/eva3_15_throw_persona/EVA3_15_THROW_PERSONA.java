/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_15_throw_persona;

import java.util.InputMismatchException;
import java.util.Scanner;





/**
 *
 * @author Diana
 */
public class EVA3_15_THROW_PERSONA {

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
                int edad = input.nextInt();
                if (edad < 0) {
                    throw new Exception("El valor " + edad + " no es una edad valida");
                }
                System.out.println("Tu edad edad: " + edad);
                Error = false;
            } catch (InputMismatchException e) {
                System.out.println( input.next () + "No es un nuero valido");
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Edad no valida");
            }

        } while (Error);
        
   Persona per = new Persona();
        per.setNombre("Diana Arzaga");
        try {
            per.setEdad(capturarEdad ());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona per2 = new Persona("Diana Arzaga", capturarEdad ());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public static int capturarEdad () throws Exception{
        Scanner input = new Scanner (System.in);
        System.out.println("Captura la edad: ");
        int valor =0;
        try{
         valor = input.nextInt();
        
        }catch (InputMismatchException ex){
           throw new Exception ("Introdujiste una cadena de texto, no es un numero valido"); 
        }
        return valor;

    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad >= 0) & (edad <= 130)) {
            this.edad = edad;
        } else {
            throw new Exception("Rango de edad incorrecto");
        }
    }

}
