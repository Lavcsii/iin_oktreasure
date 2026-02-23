/*
* File: Tame.java
* Author: Fazekas Laura
* Copyright: 2026, Fazekas Laura
* Group: SZOFT-IIN
* Date: 2026-02-23
* Github: https://github.com/oktatrefakt/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;

/* Az osztály neve: Tame */
public class Tame {
    /*
     * Ez egy fájlkezelő osztály. Úgy lett megírva, hogy
     * elfogadja a paraméterként egy szöveg. Potosabban a
     * benne lévő csa metóuds fogadja a paramétert.
     * Jelenleg nincs ellenőrzés, hogy megfelel-e a szöveg.
     * Talán nem is lesz, ez még a jövő titka.
     */
    public static void csa(String d) {
        // Itt fogadjuk a paramétert a d változóban
        try {
            FileWriter fileWriter = new FileWriter("adat.txt", Charset.forName("utf-8"), true);
            // Kettőspontot írunk a szövegben szeparátornak
            fileWriter.write(d + ":");
            // Dátumot is kiírunk
            LocalDate now = LocalDate.now();
            fileWriter.write(now.toString() + "\n");
            // Bezárjuk a fájl. Ezt mindig kell.
            fileWriter.close();
        } catch (IOException e) { // catch ág kezdete
            // A catch ág hiba esetén
            System.err.println(e.getMessage());
        } // catch vége

    }
}