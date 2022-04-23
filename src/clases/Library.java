/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 * [Clase abstracta Padre que implementa de manera general atributos y
 * metodos que modelan el objeto de libreria ]
 *
 * @version [1.00.000 2022-02-27
 * @author [Elkin Estiven González Cuellar - Juan Esteban Ramirez Reyes
 * elkin.gonzalez-c@mail.escuelaing.edu.co - ramirezjuan9806@gmail.com]
 * @since [1.00.000]
 *
 */
public abstract class Library {

    private int Size;
    private ArrayList collection = new ArrayList(Size);

    public Library() {
    }

    public Library(int Size, ArrayList collection) {
        this.Size = Size;
        this.collection = collection;
    }

    /**
     * Metodo abstracto que se debe implementar en la clase de se herede
     */
    public abstract void storeObjects();
    /**
     * Metodo abstracto que se debe implementar en la clase de se herede
     */
    public abstract ArrayList showObjects();

    /**
     * getters and setters
     * @return
     */
    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public ArrayList getCollection() {
        return collection;
    }

    public void setCollection(ArrayList collection) {
        this.collection = collection;
    }


}

