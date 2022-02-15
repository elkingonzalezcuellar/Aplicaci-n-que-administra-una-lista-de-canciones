package clases;

import java.util.Date;

public class ClasePrincipal {
    public static void main(String[] args) {
        Song song1 = new Song();
        SongsLibrary principalLibrary=new SongsLibrary();
        song1.setTitle("El rap de juan");
        song1.setCoverPage("rapjuan.jpg");
        song1.setId(1);
        song1.setDate(new Date());
        song1.setDescription("El rap de juan fue un rap que enamoro a millones de mujeres");
        principalLibrary.addSong(song1);

        System.out.println("Canción "+song1.getId()+"\n"+principalLibrary.getColletionSong());

    }
}
