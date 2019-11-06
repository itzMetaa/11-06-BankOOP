
package bankoop;

import bankiszolgaltatas.kartya.Kartya;
import bankiszolgaltatas.szamla.HitelSzamla;
import bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

public class BankOOP {

    public static void main(String[] args) {
        Bank Xd = new Bank();
        
        Tulajdonos TD = new Tulajdonos("Tulnui Lunu Dumunyuk");
        Tulajdonos TDne = new Tulajdonos("Tulnui Dumunyukné");
        
        Szamla TDsz = Xd.szamlaNyitas(TD,200000);
        
        Kartya TDk = TDsz.ujKartya("1111");
        Kartya TDnek = TDsz.ujKartya("2222");
        TDsz.beTesz(30000);
        TDsz.kiVesz(40000);
        System.out.println(TDsz.getEgyenleg());
    }
    
}
