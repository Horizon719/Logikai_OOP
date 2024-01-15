package logikaioop.view;

import java.util.Scanner;

public class ConsoleView {
    private static final Scanner SC = new Scanner(System.in);
    
    public void kiir(String str){
        System.out.println(str);
    }
    
    public <T> void kiir(T[] obj){
        for (T t : obj) {
            this.kiir(t.toString());
        }
    }
    
    public int szamBekerTartomanyban(String szoveg, int min, int max){
        int szam;
        do {
            System.out.print(szoveg);
            szam = SC.nextInt();
        } while (szam < min || szam > max);
        
        return szam;
    }
}
