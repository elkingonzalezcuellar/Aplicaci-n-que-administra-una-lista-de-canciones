/**
 * [Clase que guarda los objetos de tipo cancion dentro de un arrays list ]
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
package clases;
import java.util.ArrayList;
import java.util.Date;

public class SongsLibrary extends Library implements Isong  {

    private ArrayList<Song> collectionSong = new ArrayList<Song>();

    public SongsLibrary() {
    }

    public SongsLibrary(int Size, ArrayList<Song> collectionSong) {
        this.collectionSong = collectionSong;
    }

    /**
     * Metodo de le asigna cada atributo a cada Objeto de tipo Song
     * y lo guarda en el ArrayList collectionSong
     */
    @Override
    public void storeObjects() {
        Song doNotDisturb = new Song("Drake", "Do not Disturb", "Image Drake", "As the final cut on More Life, Do Not Disturb picks up where Lose You left off, showing Drake at his most pensive state.", "Hip hop", 4.43, 1, new Date(117,3,12));
        Song idontCare = new Song("Fall out boys", "I dont Care", "Image Folie à Deux", "I Don't Care From the album ", "Pop Rock", 4.30, 2, new Date(117,3,10));
        Song sins = new Song("Panic! at the disco", "I wirte sins  not tradegies", "Image A Fever You Can't Sweat Out", "BEANS", "Pop Rock", 3.05, 3, new Date(105,3,12));
        Song youare = new Song("Grupo niche", "Eres", "Image - A Prueba De Fuego", "", "Salsa", 5.54, 4, new Date(108,07,16));
        Song circles = new Song("Post malone", "Circles", "Image- album 'Hollywood's Bleeding’", "Post Malone performing “Circles” live on the Runaway Tour.", "Pop", 3.36, 5, new Date(113,9,18));
        Song miss = new Song("Blink 182", "I miss your", "Image -performing Geffen", "This song is a timeless classic", "Pop", 3.49, 6, new Date(104,2,10));
        Song charlie = new Song("Cold Play", "Charlie Brown", "Image Mylo Xyloto released", "Charlie Brown is taken from the album Mylo Xyloto released in 2011", "Pop", 4.45, 7, new Date(111,7,01));
        Song never = new Song("Christian Nodal", "Nunca fuimos ni seremos", "Image- Sentimiento mexicano", "Historia Latinoamérica con su estilo Mariachi", "Mexicana", 4.20, 8, new Date(122,2,20));
        Song blinding = new Song("The Weekend", "Blinding Lights", "Imagen- From the album After Hours", "The Start boy is back", "Pop", 3.56, 9, new Date(120,9,25));
        Song proposal = new Song("Romeo Santos", "Propuesta indecente", "Image from the album Formula", "Nominación World Music Award a la Mejor Canción del Mundo", "Bachata", 4.28, 10, new Date(114,10,15));
        addSong(doNotDisturb);
        addSong(idontCare);
        addSong(sins);
        addSong(youare);
        addSong(circles);
        addSong(miss);
        addSong(charlie);
        addSong(never);
        addSong(blinding);
        addSong(proposal);

    }

    /**
     * Metodo de devuelve el array de la clase
     * @return array collectionSong
     */
    @Override
    public ArrayList<Song> showObjects() {
        return collectionSong;
    }

    @Override
    public void play() {
    }

    /**
     * Agrega una canción al array
     * @param name
     */
    public void addSong(Song name) {
        this.collectionSong.add(name);
    }
    /**
     * Metodo de devuelve el array de la clase
     * @return array collectionSong
     */
    public ArrayList<Song> getCollectionSong() {
        return collectionSong;
    }

}
