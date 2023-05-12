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
        String content = "";
        try{
            File archivo = new File(ruta); //SE ABRE EL ARCHIVO
            FileReader lector = new FileReader(archivo); //SE LEE EL ARCHIVO
            BufferedReader br = new BufferedReader(lector); //SE COLOCA DE MANERA TEMPORAL TODO EL CONTENIDO DEL ARCHIVO
            
            //LEER CADA LINEA Y HAY QUE UNIRLO
            String line = "";
            while((line = br.readLine()) != null){
                content += line + "\n";
                int positionComaId = line.indexOf(",");
                int positionComaName = line.indexOf(",", positionComaId + 1);
                int positionComaGenre = line.indexOf(",", positionComaId + 2);
                int positionComaYear = line.indexOf(",", positionComaId + 3);
                movies.add(
                        line.substring(0, positionComaId), 
                        line.substring(positionComaId + 1, positionComaName),
                        line.substring(positionComaName + 1, positionComaGenre),
                        line.substring(positionComaGenre + 1, positionComaYear),
                        line.substring(positionComaYear + 1)
                );
                i++;
            }
            //SE CIERRAN LOS ELEMENTOS
            br.close();
            lector.close();
        }
        catch(Exception e){
            e.printStackTrace();
            content = "Error en la lectura del archivo" + e.toString();
        }
        return content;
    }
}