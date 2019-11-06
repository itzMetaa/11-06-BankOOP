/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tulajdonos;

/**
 *
 * @author Diak
 */
public abstract class Tulajdonos {
    private String nev;

    public Tulajdonos(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
}
