/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 * [Clase que representa una canción con sus atributos
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
public class Song implements Comparable<Song>{

    private String title, coverPage, description, artist, gender;
    private int id;
    private double duration;
    private Date date;
    public Song() {
    }

    public Song(String artist, String title, String coverPage, String description, String gender, double duration, int id, Date date) {
        this.title = title;
        this.coverPage = coverPage;
        this.description = description;
        this.gender = gender;
        this.duration = duration;
        this.id = id;
        this.date = date;
        this.artist = artist;
    }

    /**
     * [Compara una canción por duración
     * @param e objecto canción que se quiere comparar
     * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
     * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
     *
     * @since [1.00.000]
     *
     * @see [ información relevante
     * <a href="https://docs.oracle.com/javase/7/docs/api/.html#@see">javadoc
     * - The Java API Documentation Generator</a>]

     *
     */
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

    public double getDuration() {
        return duration;
    }
    public String getGender() {
        return gender;
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

}
