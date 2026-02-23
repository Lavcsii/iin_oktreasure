/*
* File: Treasure.java
* Author: Fazekas Laura
* Copyright: 2026, Fazekas Laura
* Group: SZOFT-IIN
* Date: 2026-02-23
* Github: https://github.com/Lavcsii/iin_oktreasure.git
* Licenc: MIT
*/

package com.example;

//Importáljuk a Scanner-t:
import java.util.Scanner;

//Itt jön a bekérőosztály:
public class Treasure {
    /* A tényelges bekérés a kol megtódusban van */
    public static void kol() {
        // TODO: Meg kell oldani, ogy Windows terminalban (852) működjön
        /*
         * A try() szerkezet, nem egyenlő a try-catch szerkezettel.
         * A try() szerkezet a zárójelben megnyitott fájlt automatikusan
         * lezárja, ha try(){} blokk végetér.
         */
        try (Scanner g = new Scanner(System.in)) {
            System.out.print("Műkincs: ");
            String t = g.nextLine();

            // Új rész: ha nem adott meg semmit, ne írjunk fájlba
            if (t.isEmpty()) {
                System.out.println("Nem adtál meg műkincs nevet!");
                return;
            }

            Tame.csa(t);
            System.out.println("A műkincs sikeresen mentés!");
        } catch (Exception e) {
            System.err.println("Hiba történt: " + e.getMessage());
        }
    }
}