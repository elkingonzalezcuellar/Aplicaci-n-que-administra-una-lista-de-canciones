/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class SortSongs {

    public void filterByDate(ArrayList songs) {
        Collections.sort(songs, new CompareSongs());

    }

    public void filterByDuration(ArrayList songs) {
        Collections.sort(songs);
    }
}
