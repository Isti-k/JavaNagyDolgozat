package org.example;


import org.example.modell.Szak;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Szak szak = new Szak("Gépész");

        szak.szakKiirasa();
        //szak.szakBeolvasasa();
    }
}