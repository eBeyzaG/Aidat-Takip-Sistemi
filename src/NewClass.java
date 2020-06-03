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
public class NewClass {
    public static void main(String[] args) {
               Resident r = new Resident("Beyza", "Gürer", "05321215");
               Daire d =  new  Daire(r, "A", "3");
               Daire.daireler.add(d);
               
               Resident r2 = new Resident("Ayşe", "Güfasrer", "05321215");
               Resident r3 = new Kiracı("Ayşe", "Güfasrer", "05321215","lk","klşm","324");
               Daire d2 =  new  Daire(r2, "B", "7");
               Daire.daireler.add(d2);
               
             for(Daire d1 :Daire.daireler){
                 Aidat a1= new Aidat(120, "Ödendi");
                 Aidat.Ocak.add(a1);
             }
              
             
          
              
              
//              new AidatFrame().setVisible(true);
//              new MainFrame().setVisible(true);
//              
             
             
    }
}
