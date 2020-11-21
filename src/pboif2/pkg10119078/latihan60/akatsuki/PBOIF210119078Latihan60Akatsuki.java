/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan60.akatsuki;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Deidara d = new Deidara("Deidara","Iwagakure","Deceased");
            
            System.out.println("Nama : " + d.getName());
            System.out.println("Origin : " + d.getOrigin());
            System.out.println("Status : " + d.getStatus());
            d.fightStyle();
            
            Hidan h = new Hidan("Hidan","Yugakure","Buried alive");
            System.out.println("\nNama : " + h.getName());
            System.out.println("Origin : " + h.getOrigin());
            System.out.println("Status : " + h.getStatus());
            h.fightStyle();
            
            UchihaItachi itachi = new UchihaItachi("Uchiha Itachi","Konohagakure","Succumbed to Illness");
            System.out.println("\nNama : " + itachi.getName());
            System.out.println("Origin : " + itachi.getOrigin());
            System.out.println("Status : "+ itachi.getStatus());
            itachi.fightStyle();
            
            Kakuzu k = new Kakuzu("Kakuzu","Takigakure","Deceased");
            System.out.println("\nNama : " + k.getName());
            System.out.println("Origin : " + k.getOrigin());
            System.out.println("Status : "+ k.getStatus());
            k.fightStyle();
            
            Kisame ki = new Kisame("Kisame","Kirigakure","Alive");
            System.out.println("\nNama : " + ki.getName());
            System.out.println("Origin : " + ki.getOrigin());
            System.out.println("Status : "+ ki.getStatus());
            ki.fightStyle();
            
            Konan ko = new Konan("Konan","Amegakure","Left Organisation");
            System.out.println("\nNama : " + ko.getName());
            System.out.println("Origin : " + ko.getOrigin());
            System.out.println("Status : "+ ko.getStatus());
            ko.fightStyle();
        
            Nagato n = new Nagato("Nagato","Amegakure","Deceased");
            System.out.println("\nNama : " + n.getName());
            System.out.println("Origin : " + n.getOrigin());
            System.out.println("Status : "+ n.getStatus());
            n.fightStyle();
            
            Orochimaru o = new Orochimaru("Orochimaru","Konohagakure","Left Organisation");
            System.out.println("\nNama : " + o.getName());
            System.out.println("Origin : " + o.getOrigin());
            System.out.println("Status : "+ o.getStatus());
            o.fightStyle();
            
            Sasori s = new Sasori("Sasori","Sunagakure","Deceased");
            System.out.println("\nNama : " + s.getName());
            System.out.println("Origin : " + s.getOrigin());
            System.out.println("Status : "+ s.getStatus());
            s.fightStyle();
            
            Tobi t = new Tobi("Tobi","Konohagakure","Alive");
            System.out.println("\nNama : " + t.getName());
            System.out.println("Origin : " + t.getOrigin());
            System.out.println("Status : "+ t.getStatus());
            t.fightStyle();
    }
    
}
