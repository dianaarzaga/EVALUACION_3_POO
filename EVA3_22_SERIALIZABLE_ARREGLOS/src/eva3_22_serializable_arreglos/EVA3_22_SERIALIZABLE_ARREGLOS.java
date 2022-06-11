/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //colections. <tipos de datos genericos>
        ArrayList<Persona> miListaPersona = new ArrayList ();
        miListaPersona.add(new Persona ("Diana", " Arzaga"));
        miListaPersona.add(new Persona ("Evelyn", " Arzaga"));
        miListaPersona.add(new Persona ("Dimas", " Arzaga"));
        miListaPersona.add(new Persona ("Dora", " Arzaga"));
        miListaPersona.add(new Persona ("Angel", " Maldonado"));
        miListaPersona.add(new Persona ("Sofia", " Maldonado"));
        escribirObj(miListaPersona);
        leerObj();
        
    }
    
    

    public static void escribirObj(Object obj) {
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/archivos/archivo5.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


public static void leerObj() {
        try {
            FileInputStream abrirArchivo = new FileInputStream("c:/archivos/archivo5.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArchivo);
            ArrayList<Persona> miListaPersona = (ArrayList<Persona>) leerObjeto.readObject();
            for (int i = 0; i< miListaPersona.size(); i++){
                Persona persona = miListaPersona.get(i);
                System.out.println("Nombre:" + persona.getNombre() + "" + 
                    persona.getApellido());
            }
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}





class Persona  implements Serializable{

    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}