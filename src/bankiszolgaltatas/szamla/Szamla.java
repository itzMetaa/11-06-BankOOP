
package bankiszolgaltatas.szamla;

import bankiszolgaltatas.BankiSzolgaltatas;
import tulajdonos.Tulajdonos;

public abstract class Szamla extends BankiSzolgaltatas{
    private int egyenleg;
    
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.egyenleg = 0;
    }

    public int getEgyenleg() {
        return egyenleg;
    }
    
    public void beTesz(int osszeg){
        egyenleg += osszeg;
    }
    
    public abstract boolean kiVesz(int osszeg);
}
