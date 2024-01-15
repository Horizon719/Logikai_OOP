
package logikaioop.controller;

import logikaioop.model.Lada;
import logikaioop.view.ConsoleView;

public class MainController {
    private Lada[] ladak;
    private ConsoleView view;
    
    public MainController() {
        this.ladak = new Lada[]{new Lada("Én rejtem a kincset!", "arany", false), // h
                        new Lada("Nem én rejtem a kincset!", "ezüst", true), //h kincs
                        new Lada("Az arany hazudik!", "bronz", false)}; //i
        
        this.view = new ConsoleView();
        
        this.feladat();
    }
    
    private void feladat() {
        this.view.kiir(this.ladak);
        int valasztas = this.view.szamBekerTartomanyban("Melyik: ", 1, this.ladak.length);
        
        String valasz = "A választás helytelen";
        if (this.ladak[valasztas - 1].isKincs()){
            valasz = "A választás helyes!";
        }
        this.view.kiir(valasz);
    }
}
