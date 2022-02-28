/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Song implements Comparable<Song> {

    private String title, coverPage, description, artist, gender;
    private double duration;
    private int id;
    private Date date;

    public Song() {
    }

    public Song(String title, String coverPage, String description, String artist, String gender, double duration, int id, Date date) {
        this.title = title;
        this.coverPage = coverPage;
        this.description = description;
        this.artist = artist;
        this.gender = gender;
        this.duration = duration;
        this.id = id;
        this.date = date;
    }

    @Override

    public String toString() {
        return "\n" + "Artista: " + artist
                + " | Titulo: " + title
                + " | Caratula: " + coverPage
                + " | Descripción: " + description
                + " | Duración: " + duration
                + " | Genero: " + gender
                + " | Identificador: " + id
                + " | Fecha: " + date
                + "\n";
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the coverPage
     */
    public String getCoverPage() {
        return coverPage;
    }

    /**
     * @param coverPage the coverPage to set
     */
    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Song e) {
     if (e.getDuration() > duration) {
            return -1;
        } else if (e.getDuration() > duration) {
            return 0;
        } else {
            return 1;
        }

    }

}
