
package logikaioop;

import logikaioop.model.Lada;
import java.util.Scanner;

public class Program {
    private static final Scanner SC = new Scanner(System.in);
    private Lada[] ladak;
    
    public Program() {
        this.elso();
        int szam = this.masodik();
        this.harmadik(szam);
    }
    
    private void elso() {
        this.ladak = new Lada[]{new Lada("Én rejtem a kincset!", "arany", false), // h
                        new Lada("Nem én rejtem a kincset!", "ezüst", true), //h kincs
                        new Lada("Az arany hazudik!", "bronz", false)}; //i
        
        System.out.println("Leírás");
        for (Lada lada : ladak) {
            System.out.println(lada);
        }
    }
    
    private int masodik() {
        int szam;
        do {
            System.out.print("Melyik: ");
            szam = SC.nextInt();
        } while (szam < 1 || szam > 3);
        
        return szam;
    }
    
    private void harmadik(int szam){
        if (this.ladak[szam - 1].isKincs()){
            System.out.println("A válasz helyes.");
        } else{
            System.out.println("A válasz helytelen.");
        }
    }
}
