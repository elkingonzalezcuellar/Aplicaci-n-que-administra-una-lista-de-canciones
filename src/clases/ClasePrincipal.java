package clases;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasePrincipal {
    PlayList playList=new PlayList();
    static SongsLibrary principalLibrary = new SongsLibrary();


    public static void main(String[] args) {
        ClasePrincipal claseP=new ClasePrincipal();
        principalLibrary.storeObjects();
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
        int selection = 0;
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
                    System.out.println("/*\n" +

                            "xxxxxxxxxxx   xxxxxxxxxx  xxxxxxxxxxx   xx      xxxxxxxxxx   xxxxxxx   xxxxxxxxxx xxxxxxxx    xxxxxxxx  xxxxxxxxx\n" +
                            "xx        xx      xx      xx        xx  xx          xx     xxx     xxx     xx     x          xx         xx     xx\n" +
                            "xx        xx      xx      xx          x xx          xx    x           xx   xx     x        x            xx     xx\n" +
                            "xx       xx       xx      xx         xx xx          xx    x            x   xx     x        x            xx     xx\n" +
                            "xxxxxxxxxxx       xx      xxxxxxxxxxxx  xx          xx    x            x   xx     xxxxxxxx x            xxxxxxxxx\n" +
                            "xx        xx      xx      xx         xx xx          xx    xx           x   xx     x        x            xx     xx\n" +
                            "xx        xx      xx      xx        xxx xx          xx      xx       xx    xx     x         xx          xx     xx\n" +
                            "xxxxxxxxxxx   xxxxxxxxxx  xxxxxxxxxxxx  xxxxxxxx xxxxxxxxxx  xxxxxxxxx     xx     xxxxxxxxx  xxxxxxxxx  xx     xx\n");
                    //principalLibrary.storeObjects();
                    System.out.println(principalLibrary.showObjects());
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    subMenu();
                } else if (selection == 2) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Cerrando programa...");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                    System.exit(0);
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
        int selection = 0;
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
                    System.out.println("    6. Volver al menú principal.");
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
                    mainMenu();
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
        int selection = 0;
        try{
            do {
                do {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Porfavor seleccione una opción:");
                    System.out.println("    1. Filtar por Año.");
                    System.out.println("    2. Filtrar por Genero.");
                    System.out.println("    3. Ordenar por Fecha.");
                    System.out.println("    4. Ordenar por Duración.");
                    System.out.println("    5. Devolverse al menu anterior.");
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
                    System.out.println("/*\n" +

                            "xxxxxxxxxxx   xxxxxxxxxx  xxxxxxxxxxx   xx      xxxxxxxxxx   xxxxxxx   xxxxxxxxxx xxxxxxxx    xxxxxxxx  xxxxxxxxx\n" +
                            "xx        xx      xx      xx        xx  xx          xx     xxx     xxx     xx     x          xx         xx     xx\n" +
                            "xx        xx      xx      xx          x xx          xx    x           xx   xx     x        x            xx     xx\n" +
                            "xx       xx       xx      xx         xx xx          xx    x            x   xx     x        x            xx     xx\n" +
                            "xxxxxxxxxxx       xx      xxxxxxxxxxxx  xx          xx    x            x   xx     xxxxxxxx x            xxxxxxxxx\n" +
                            "xx        xx      xx      xx         xx xx          xx    xx           x   xx     x        x            xx     xx\n" +
                            "xx        xx      xx      xx        xxx xx          xx      xx       xx    xx     x         xx          xx     xx\n" +
                            "xxxxxxxxxxx   xxxxxxxxxx  xxxxxxxxxxxx  xxxxxxxx xxxxxxxxxx  xxxxxxxxx     xx     xxxxxxxxx  xxxxxxxxx  xx     xx\n");
                    System.out.println(principalLibrary.showObjects());
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                    subMenu();
                }
            } while (flag != 2);
        }catch (InputMismatchException exception) {
            System.out.println("Mala elección");
            subMenu2();

        }
    }

}