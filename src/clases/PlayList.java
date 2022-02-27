/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PlayList extends SongsLibrary implements Isong {

    String name;
    private Scanner in = new Scanner(System.in);
    private boolean exit=false;
    private int isong,option;
    private ArrayList<Song> collectionPlaylist = new ArrayList<Song>();

    @Override
    public void play() {
        System.out.println("Reproduciendo canción");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void newPlayList(ArrayList songsLibrary) {

        System.out.println("Ingrese el nombre de la playlist");
        setName(in.nextLine());
        System.out.println(" Ingrese el identificador de cada cancion que quiere en la playlist");
        isong= (in.nextInt())-1;
        collectionPlaylist.add((Song) songsLibrary.get(isong));
        do{
            System.out.println(" Quiere agregar otra cancion a la playlist? \n 1) Si \n 2) No");
            option=in.nextInt();
            if (option==1){
                System.out.println(" Ingrese el identificador de cada cancion que quiere en la playlist");
                isong= (in.nextInt())-1;
                collectionPlaylist.add((Song) songsLibrary.get(isong));
            }else if (option==2){
                exit=true;
            }
            else{
                System.out.println("Eligio mal, vuelva a elegir");
            }
        }while(!exit);


    }

    public ArrayList<Song> getCollectionPlaylist() {
        return collectionPlaylist;
    }

    public void nextSong() {
    }

    public void stopSong() {
    }

    public void previousSong() {
    }

}
