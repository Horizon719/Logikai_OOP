
package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Allitas a1 = new Allitas("Az 1. állítás!");
        Allitas a2 = new Allitas("A 2. állítás!");
        Allitas a3 = new Allitas("A 3. állítás!");
        
        Allitas allitas1 = new Allitas("Az 1. állítás!");
        Allitas allitas2 = new Allitas("A 2. állítás!");
        Allitas allitas3 = new Allitas("A 3. állítás!");
        
        System.out.println("Leírás");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("Melyik:");
        System.out.println("A válasz: jó | rossz");
        
    }
    
}
