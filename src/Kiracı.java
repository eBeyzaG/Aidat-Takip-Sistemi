/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeolsun;

/**
 *
 * @author Beyza
 */
public class Kiracı extends Resident {
   String evSahibiTel;
    String evSahibi_ad, evSahibi_soyad; 

    public Kiracı(String evSahibiTel, String evSahibi_ad, String evSahibi_soyad, String ad, String soyad, String telefon) {
       super(ad, soyad, telefon);
        this.evSahibiTel = evSahibiTel;
        this.evSahibi_ad = evSahibi_ad;
        this.evSahibi_soyad = evSahibi_soyad;
    }

   
    
}
