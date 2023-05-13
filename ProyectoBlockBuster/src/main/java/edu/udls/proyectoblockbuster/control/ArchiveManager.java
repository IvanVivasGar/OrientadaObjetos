package edu.udls.proyectoblockbuster.control;
import edu.udls.proyectoblockbuster.modelo.MovieList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */

public class ArchiveManager{
    public static String leerArchivo(String ruta, MovieList movies){
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
                int positionComaGenre = line.indexOf(",", positionComaName + 1);
                int positionComaYear = line.indexOf(",", positionComaGenre + 1);
                movies.add(
                        line.substring(0, positionComaId), 
                        line.substring(positionComaId, positionComaName),
                        line.substring(positionComaName, positionComaGenre),
                        line.substring(positionComaGenre, positionComaYear),
                        line.substring(positionComaYear)
                );
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
    
    public static void reescribirArchivo(String route, MovieList movies){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(route, false));
            
            movies.current = movies.first;
            while(movies.current != null){
                String line = movies.current.getMovieId() + movies.current.getMovieName() + movies.current.getMovieGenre() + movies.current.getMovieYear() + movies.current.getMovieLength();
                bw.write(line);
                bw.newLine();
                movies.current = movies.current.getNext();
            }
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la reescritura del archivo");
        }
    }
}