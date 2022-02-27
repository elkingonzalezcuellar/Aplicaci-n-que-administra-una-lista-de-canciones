package clases;

import java.util.Date;
import java.util.InputMismatchException;

public class ClasePrincipal {

    public static void main(String[] args) {
        //Song one = new Song();
        SongsLibrary principalLibrary = new SongsLibrary();
        principalLibrary.storeObjects();
        System.out.println(principalLibrary.showObjects());

        //System.out.println("Canción "+song1.getId()+"\n"+principalLibrary.getColletionSong());
    }

    public void MainMenu() {
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection = 0;
        try {
            do {
                do {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Porfavor seleccione una opción:");
                    System.out.println("    1. Mostrar libreria principal.");
                    System.out.println("    2. Salir.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    //selection = in.nextInt();

                    if (selection >= 1 && selection <= 2) {
                        flag = 1;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                } while (flag == 0);

                if (selection == 1) {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    //MenuCreateShip();
                } else if (selection == 2) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    //System.out.println(getShipsCreated());

                } else if (selection == 3) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    flag = 2;
                }
            } while (flag != 2);
        } catch (InputMismatchException exception) {
            System.out.println("Mala elección");
        }

    }

}
