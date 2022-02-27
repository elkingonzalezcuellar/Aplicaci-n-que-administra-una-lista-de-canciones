/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author PC
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

    public abstract void storeObjects();

    public abstract ArrayList showObjects();

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
