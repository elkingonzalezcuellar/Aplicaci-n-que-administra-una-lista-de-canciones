package clases;
import java.util.Comparator;
/**
 * [Clase que compara dos objetos de tipo Song]
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
public class CompareSongs implements Comparator<Song>{

    /**
     * Metodo que compara por fecha.
     *
     * @return int -1 si es menor , 0 si es igual , 1 si es mayor
     * @author [Elkin Estiven González Cuellar]
     * @param s1 Canción 1 para comparar
     * @param s2 Canción 1 para comparar
     * @see https://docs.oracle.com/javase/7/docs/api/
     * @since [1.00.000]
     *
     */
    @Override
    public int compare(Song s1, Song s2) {
        if (s1.getDate().compareTo(s2.getDate()) < 0) {
            return -1;
        } else if (s1.getDate().compareTo(s2.getDate()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
