/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Comparator;

/**
 *
 * @author PC
 */
public class CompareSongs implements Comparator<Song> {

    @Override
    public int compare(Song s1, Song s2) {
        if (s1.getDate().compareTo(s2.getDate()) < 0) {
            return -1;
        } else if (s1.getDate().compareTo(s2.getDate()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
