package edu.udls.proyectoblockbuster.control;
import edu.udls.proyectoblockbuster.modelo.MovieList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Ivan
 */

public class ArchiveManager{
    public static String leerArchivo(String ruta, MovieList movies){
        int i = 0;
        String contenido = "";
        try{
            File archivo = new File(ruta); //SE ABRE EL ARCHIVO
            FileReader lector = new FileReader(archivo); //SE LEE EL ARCHIVO
            BufferedReader br = new BufferedReader(lector); //SE COLOCA DE MANERA TEMPORAL TODO EL CONTENIDO DEL ARCHIVO
            
            //LEER CADA LINEA Y HAY QUE UNIRLO
            String linea = "";
            while((linea = br.readLine()) != null){
                contenido += linea + "\n";
                movies.add(linea);
                i++;
            }
            //SE CIERRAN LOS ELEMENTOS
            br.close();
            lector.close();
        }
        catch(Exception e){
            e.printStackTrace();
            contenido = "Error en la lectura del archivo" + e.toString();
        }
        return contenido;
    }
}