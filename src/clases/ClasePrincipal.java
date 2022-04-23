package clases;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase encargada de la ejecución del programa]
 * @version [1.00.001 2022-04-23
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */

public class ClasePrincipal {
    public PlayList playList=new PlayList();
    public SongsLibrary principalLibrary = new SongsLibrary();

    public static void main(String[] args) {
        ClasePrincipal claseP=new ClasePrincipal();

        claseP.mainMenu();
    }
    /**
     * Metodo encargado de mostrar el menu principal y ejecutar una opcion
     * seleccionada por el usuario.
     */
    public void mainMenu() {
        Scanner in = new Scanner(System.in);
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection;
        try{
            do {
                do {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Porfavor seleccione una opción:");
                    System.out.println("    1. Mostrar libreria principal.");
                    System.out.println("    2. Salir.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    selection = in.nextInt();

                    if (selection >= 1 && selection <= 3) {
                        flag = 1;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                } while (flag == 0);

                if (selection == 1) {
                    System.out.println("BIBLIOTECA PRINCIPAL");
                    principalLibrary.storeObjects();
                    System.out.println(principalLibrary.showObjects());
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    subMenu();
                } else if (selection == 2) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                }
            } while (flag != 2);
        }catch (InputMismatchException exception) {
            System.out.println("Mala elección");
            mainMenu();

        }

    }

    public void subMenu() {
        Scanner in = new Scanner(System.in);
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection ;
        try{
            do {
                do {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Porfavor seleccione una opción:");
                    System.out.println("    1. Crear Playlist.");
                    System.out.println("    2. Filtar por Año.");
                    System.out.println("    3. Filtrar por Genero.");
                    System.out.println("    4. Ordenar por Fecha.");
                    System.out.println("    5. Ordenar por Duración.");
                    System.out.println("    6. Salir.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    selection = in.nextInt();

                    if (selection >= 1 && selection <= 6) {
                        flag = 1;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                } while (flag == 0);

                if (selection == 1) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    playList.newPlayList();
                    System.out.println("-------------"+playList.getName()+"-------------");
                    System.out.println(playList.getCollectionPlaylist());
                    subMenu2();
                } else if (selection == 2) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    Filter filter=new Filter();
                    filter.yearFilter(principalLibrary.showObjects());

                } else if (selection == 3) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    Filter filter=new Filter();
                    filter.genderFilter(principalLibrary.showObjects());

                }else if (selection == 4) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    SortSongs sorter = new SortSongs();
                    sorter.sortByDate(principalLibrary.showObjects());
                    System.out.println(principalLibrary.showObjects());

                }else if (selection == 5) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    SortSongs sorter2 = new SortSongs();
                    sorter2.sortByDuration(principalLibrary.showObjects());
                    System.out.println(principalLibrary.showObjects());

                }else if(selection == 6){
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                }
            } while (flag != 2);
        }catch (InputMismatchException exception) {
            System.out.println("Mala elección");
            subMenu();
        }

    }
    public void subMenu2(){
        Scanner in = new Scanner(System.in);
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection;
        try{
            do {
                do {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Porfavor seleccione una opción:");
                    System.out.println("    1. Filtar por Año.");
                    System.out.println("    2. Filtrar por Genero.");
                    System.out.println("    3. Ordenar por Fecha.");
                    System.out.println("    4. Ordenar por Duración.");
                    System.out.println("    5. Salir.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    selection = in.nextInt();

                    if (selection >= 1 && selection <= 6) {
                        flag = 1;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                } while (flag == 0);
                if (selection == 1) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    Filter filter=new Filter();
                    filter.yearFilter(playList.getCollectionPlaylist());
                } else if (selection == 2) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    Filter filter=new Filter();
                    filter.genderFilter(playList.getCollectionPlaylist());
                }else if (selection == 3) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    SortSongs sorter = new SortSongs();
                    sorter.sortByDate(playList.getCollectionPlaylist());
                    System.out.println(playList.getCollectionPlaylist());
                }else if (selection == 4) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    SortSongs sorter2 = new SortSongs();
                    sorter2.sortByDuration(playList.getCollectionPlaylist());
                    System.out.println(playList.getCollectionPlaylist());
                }else if(selection == 5){
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                }
            } while (flag != 2);
        }catch (InputMismatchException exception) {
            System.out.println("Mala elección");
            subMenu2();

        }
    }

}
