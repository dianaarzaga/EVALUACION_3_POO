/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_20_escribir;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("c:/archivos/archivo3.txt");
        OutputStream abrirArchivo;
        OutputStreamWriter escribirArchivo;
        BufferedWriter escribirTexto;
        
        try {
            abrirArchivo = Files.newOutputStream(ruta);
            escribirArchivo = new OutputStreamWriter(abrirArchivo);
            escribirTexto = new BufferedWriter(escribirArchivo);
            escribirTexto.write ("Hola mundo!!");
            escribirTexto.flush(); //Hace permanentes los cambios
            escribirTexto.close();  // Siempre hay que cerrar el sistema
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
