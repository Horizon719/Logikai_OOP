
package logikaioop;

import java.util.Scanner;

public class Program {
    private static final Scanner SC = new Scanner(System.in);
    
    public Program() {
        this.elso();
        int szam = this.masodik();
        this.harmadik(szam);
    }
    
    private void elso() {
        Lada a1 = new Lada("Én rejtem a kincset!", "arany", false); // h
        Lada a2 = new Lada("Nem én rejtem a kincset!", "ezüst", true); //h kincs
        Lada a3 = new Lada("Az arany hazudik!", "bronz", false); //i
        
        System.out.println("Leírás");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
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
        if (szam == 2){
            System.out.println("A válasz helyes.");
        } else{
            System.out.println("A válasz helytelen.");
        }
    }
}
