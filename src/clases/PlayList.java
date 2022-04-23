
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Clase que crea una nueva playList mediante la herencia de la clase SongsLibrary
 * y que implementa la Interfaz Isong ]
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
public class PlayList extends SongsLibrary implements Isong {
    /**
     * Crecion de objetos y variables
     */
    private String name;
    private Scanner in = new Scanner(System.in);
    private boolean exit=false;
    private int isong;
    private int option;
    /**
     * Array que se usara para guardar los objetos de tipo Song que tendra la playlist
     */
    private ArrayList<Song> collectionPlaylist = new ArrayList< >();

    /**
     * Sobre escritura de la clase obligatoria de la interfaz Isong
     * @since [1.00.000]
     */
    @Override
    public void play() {
        System.out.println("Reproduciendo canción");
    }

    /**
     * getters and stter
     * @return nombre de la playlist
     * @since [1.00.000]
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo newPlayList que crea una nueva playlist mediante la creacion de un objeto tipo
     * SongLibrary. Se hace uso de los metodo de esta clase como lo es guardar los objetos
     * de tipo cancion dentro de un ArrayList (storeObjects) el cual despues se utiliza para
     * saber la posición de cada objeto debido a que la posición de cada objeto coincide con su numero
     * de identificador. Lo que nos permite tomar cada Cancion segun el identificador que elija el Usuario.
     * @since [1.00.000]
     */
    public void newPlayList() {
        SongsLibrary principalLibrary = new SongsLibrary();
        principalLibrary.storeObjects();

        System.out.println("--Ingrese el nombre de la playlist");
        setName(in.nextLine());
        System.out.println("♠ Ingrese el identificador de cada cancion que quiere en la playlist");
        isong= (in.nextInt())-1;
        collectionPlaylist.add((Song) principalLibrary.getCollectionSong().get(isong));
        do{
            System.out.println("¿Quiere agregar otra cancion a la playlist? \n 1) Si \n 2) No");
            option=in.nextInt();
            if (option==1){
                System.out.println("♠ Ingrese el identificador de cada cancion que quiere en la playlist");
                isong= (in.nextInt())-1;
                collectionPlaylist.add((Song) principalLibrary.getCollectionSong().get(isong));
            }else if (option==2){
                exit=true;
            }
            else{
                System.out.println("Eligio mal, vuelva a elegir");
            }
        }while(!exit);


    }

    /**
     *
     * @return Array con los objetos tipo son que va a tener la playlist
     * @since [1.00.000]
     */
    public ArrayList<Song> getCollectionPlaylist() {
        return collectionPlaylist;
    }

    /**
     * Metodos generales de una Playlist, aplicación de conceptos e implementaciones de
     * funciones posiblemente requeridas en actualizaciones
     * @since [1.00.000]
     */
    public void nextSong() {
    }

    public void stopSong() {
    }

    public void previousSong() {
    }


}

