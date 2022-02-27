package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Filter {
    private Scanner in = new Scanner(System.in);
    private SongsLibrary song=new SongsLibrary();
    private boolean exit=false;
    private int isong,option;
    private ArrayList<Song> collectionFilter = new ArrayList<Song>();
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
