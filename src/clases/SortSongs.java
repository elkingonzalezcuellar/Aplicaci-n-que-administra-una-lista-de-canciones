package clases;
import java.util.ArrayList;
import java.util.Collections;

/**
 * [Ordena un ArrayList con canciones por duración o fecha
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
public class SortSongs {
    /**
     * [ordenar una lista de canciones por fecha
     *
     * ej: SortSongs ej = new SortSongs(); ej.filterByDate(principalLibrary);
     *
     * @param songs lista de canciones
     * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
     * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
     *
     * @since [1.00.000]
     *
     * @see [ información relevante
     * <a href="https://docs.oracle.com/javase/7/docs/api/.html#@see">javadoc
     * - The Java API Documentation Generator</a>]

     *
     */
    public void sortByDate(ArrayList songs) {
        Collections.sort(songs, new CompareSongs());
    }
    /**
     * [ordenar una lista de canciones por duración
     *
     * ej: SortSongs ej = new SortSongs(); ej.filterByDuration(principalLibrary);
     *
     * @param songs lista de canciones
     * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
     * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
     *
     * @since [1.00.000]
     *
     * @see [ información relevante
     * <a href="https://docs.oracle.com/javase/7/docs/api/.html#@see">javadoc
     * - The Java API Documentation Generator</a>]

     *
     */
    public void sortByDuration(ArrayList songs) {
        Collections.sort(songs);
    }

}
