/*
* File: Main.java
* Author: Fazekas Laura
* Copyright: 2026, Fazekas Laura
* Group: SZOFT-IIN
* Date: 2026-02-23
* Github: https://github.com/oktatrefakt/
* Licenc: MIT
*/

//Alapértelmezett csomag, a com.example
package com.example;

/* Az osztály neve: Main */
public class Main {
    /**
     * Egyetlen belépésipont, amit a program futtat.
     * 
     * @param args
     */
    public static void main(String[] args) {
        /* Írjuk a képernyőre az alkalmazás címét */
        System.out.println("Műkincs tároló");
        // Statikus kol() függvény hívása
        Treasure.kol();
    } // main() vége
}