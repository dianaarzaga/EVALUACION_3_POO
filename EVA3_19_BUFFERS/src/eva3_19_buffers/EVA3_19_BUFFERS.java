/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diana
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir la ruta
        Path ruta = Paths.get("c:/archivos/archivo2.txt");
        //Abrimos el archivo
        InputStream abrirArchivo;
        //Leemos el archivo
        InputStreamReader leerArchivo;
        //Convertimos bytes a caracteres
        BufferedReader leerTexto;
        
        try {
            abrirArchivo = Files.newInputStream(ruta);
            leerArchivo = new InputStreamReader (abrirArchivo);
            leerTexto = new BufferedReader(leerArchivo );
            String linea = leerTexto.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = leerTexto.readLine();
            }
            leerTexto.close(); // cerrar el stream
        } catch (IOException ex) {
        }
    }
    
}
