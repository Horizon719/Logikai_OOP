
package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Lada a1 = new Lada("Az 1. állítás!", "fa", true);
        Lada a2 = new Lada("A 2. állítás!", "kő", false);
        Lada a3 = new Lada("A 3. állítás!", "gyémánt", true);
        
        System.out.println("Leírás");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("Melyik:");
        System.out.println("A válasz: jó | rossz");
        
    }
    
}
