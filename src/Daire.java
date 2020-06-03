/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeolsun;

import java.util.ArrayList;

/**
 *
 * @author Beyza
 */
public class Daire {
        double borc;
        Resident r;
        String blok, daire;

        static ArrayList <Daire> daireler = new ArrayList();

    public Daire(Resident r, String blok, String daire) {
        this.borc= 0;
        this.r = r;
        this.blok = blok;
        this.daire = daire;
    }
    
    
        
}
