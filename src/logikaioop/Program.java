
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
        Lada a1 = new Lada("Az 1. állítás!", "fa", true);
        Lada a2 = new Lada("A 2. állítás!", "kő", false);
        Lada a3 = new Lada("A 3. állítás!", "gyémánt", true);
        
        System.out.println("Leírás");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    
    private int masodik() {
        int szam;
        System.out.print("Melyik: ");
        do {
            szam = SC.nextInt();
        } while (szam < 1 || szam > 3);
        
        return szam;
    }
    
    private void harmadik(int szam){
        if (szam == 3){
            System.out.println("A válasz helyes.");
        } else{
            System.out.println("A válasz helytelen.");
        }
    }
}
