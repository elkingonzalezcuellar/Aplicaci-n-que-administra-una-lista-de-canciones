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
public class Filter {
    /**
     * Crecion de objetos y variables
     */
    private Scanner in = new Scanner(System.in);
    private SongsLibrary song=new SongsLibrary();
    private boolean exit=false;
    private int isong,option;
    /**
     * Array que se usara para guardar los objetos de tipo Song que tendra el filtro
     */
    private ArrayList<Song> collectionFilter = new ArrayList<Song>();

    /**
     * Este metodo utiliza un ArrayList de la biblioteca principal para poder comprar
     * el genero elejido por el usuario con el genero de cada objeto de tipo Song
     * y asi ir guardando en el array collectionFilter
     * @param songsLibrary Array list con objetos tipo Song
     */
    public void genderFilter(ArrayList<Song> songsLibrary) {
        collectionFilter.clear();
        System.out.println(" Elija un de los siguientes generos \n 1) Hip hop \n 2) Pop Rock \n 3) Pop  \n 4) Mexicana" +
                "\n 5) Bachata \n 6) Salsa");
        option=in.nextInt();
        if(option==1){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Hip hop"){
                    collectionFilter.add(songsLibrary.get(i));
                }
            }
        }else if (option==2){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Pop Rock"){
                    collectionFilter.add(songsLibrary.get(i));
                }

            }
        }else if (option==3){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Pop"){
                    collectionFilter.add(songsLibrary.get(i));
                }

            }
        }else if (option==4){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Mexicana"){
                    collectionFilter.add(songsLibrary.get(i));
                }

            }
        }else if (option==5){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Bachata"){
                    collectionFilter.add(songsLibrary.get(i));
                }

            }
        }else if(option==6){
            for (int i=0;i<songsLibrary.size();i++){
                if(songsLibrary.get(i).getGender()=="Salsa"){
                    collectionFilter.add(songsLibrary.get(i));
                }

            }
        }else{
            System.out.println("Eligio mal, vuelva a elegir");
        }
        System.out.println(collectionFilter);

    }
    /**
     * Este metodo utiliza un ArrayList de la biblioteca principal para poder comprar
     * el año elejido por el usuario con el año de cada objeto de tipo Song
     * y asi ir guardando en el array collectionFilter
     * @param songsLibrary Array list con objetos tipo Song
     */
    public void yearFilter(ArrayList<Song> songsLibrary) {
        collectionFilter.clear();
        int year=-1900;
        System.out.println("Ingrese el año");
        year=year+in.nextInt();
        for (int i=0;i<songsLibrary.size();i++){
            if(songsLibrary.get(i).getDate().getYear()==year){
                collectionFilter.add(songsLibrary.get(i));
            }
        }
        System.out.println(collectionFilter);
    }
}