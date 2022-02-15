package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class SongsLibrary implements IplayList {
    private ArrayList <Song> colletionSong=new ArrayList<>();
    Scanner read=new Scanner(System.in);
    public void addSong(Song song){
        this.colletionSong.add(song);
    }

    public ArrayList<Song> getColletionSong() {
        return colletionSong;
    }

    @Override
    public void newPlayList() {
        System.out.println("Ingrese el nombre de la playlist");
        String playlistName=read.nextLine();

    }
}
