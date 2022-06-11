/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  Se debe especificar que objetos (clases) son serializables
       //Debemos hacer que la clase implemente la interfaz serializable
       Persona per = new Persona("Diana", "Arzaga");
       escribirObj(per);
       leerObj();
       

    }

    //Guardar objetos
    public static void escribirObj(Object obj) {
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/archivos/archivo4.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Leer objetos
    public static void leerObj() {
        try {
            FileInputStream abrirArchivo = new FileInputStream("c:/archivos/archivo4.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArchivo);
           leerObjeto.readObject(); //siempre regresa un objeto de la clase object (class object)
           Persona per = (Persona) leerObjeto.readObject();
            System.out.println("Nombre:" + per.getNombre() + "" + 
                    per.getApellido());
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
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