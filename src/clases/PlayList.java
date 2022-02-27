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
        System.out.println("Canciones disponibles: ");

    }

    public void nextSong() {
    }

    public void stopSong() {
    }

    public void previousSong() {
    }

}
