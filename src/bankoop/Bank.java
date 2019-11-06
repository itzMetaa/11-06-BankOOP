package bankoop;

import bankiszolgaltatas.szamla.HitelSzamla;
import bankiszolgaltatas.szamla.MegtakaritasiSzamla;
import bankiszolgaltatas.szamla.Szamla;
import java.util.LinkedList;
import java.util.List;
import tulajdonos.Tulajdonos;

public class Bank {
    private List<Szamla> bankSzamlak;
    
    public Bank(){
        this.bankSzamlak = new LinkedList<>();
    }
    
    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret){
        Szamla szamla;
        if(hitelKeret > 0){
            szamla = new HitelSzamla(tulajdonos, hitelKeret);
        }
        else {
            szamla = new MegtakaritasiSzamla(tulajdonos);
        }
        this.bankSzamlak.add(szamla);
        return szamla;
    }
    
    public long getOsszEgyenleg(){
        long s = 0;
            for (Szamla szamla : bankSzamlak) {
            s+=szamla.getEgyenleg();
        }
        return s;
    }
}
