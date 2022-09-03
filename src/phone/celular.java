package phone;

import java.text.DecimalFormat;

public class celular {
    DecimalFormat df = new DecimalFormat("###.##");
    int num, sgnC, aumentSgnC = 20;
    String name;
    double prcSgn, prcSgnMenos = 0.05;

    public celular(int num, int sgnC, String name, double prcSgn) {
        this.num = num;
        this.sgnC = sgnC;
        this.name = name;
        this.prcSgn = prcSgn;
    }
    
    public Double cosCsm() {
        return (sgnC*prcSgn);
    }
    
    public Double prcIgv () {
        return (0.18 * cosCsm());
    }
    
    public Double ttPg () {
        return (cosCsm() + prcIgv());
    }
    
    public int amntSgnC () {
        return (sgnC + aumentSgnC);
    }
    
    public double dsmSgnc () {
        return ((prcSgn) - (prcSgn * prcSgnMenos));
    }
    
    // NUEVOS DATOS
    public Double cosCsmA() {
        return (amntSgnC()*dsmSgnc());
    }
    
    public Double prcIgvA () {
        return (0.18 * cosCsmA());
    }
    
    public Double ttPgA () {
        return (cosCsmA() + prcIgvA());
    }
    public String mostrar () {
        return "Numero : " + num + "\n" +
               "\nUsuario : " + name + "\n" +
               "\nSegundo consumidos : " + sgnC + "\n" +
               "\nPrecio por segundo : " + prcSgn + "\n" +
               "----------- CALCULOS ----------- " + 
               "\nCosto de consumo : S/" + cosCsm() +
               "\nImpuesto IGV : S/" + df.format(prcIgv()) +
               "\nTOTAL A PAGAR : S/" + ttPg() + "\n";
    }
    
    public String mostrar2 () {
        return "Numero : " + num + "\n" +
               "\nUsuario : " + name + "\n" +
               "\nSegundo consumidos : " + amntSgnC() + "\n" +
               "\nPrecio por segundo : " + dsmSgnc() + "\n" +
               "----------- CALCULOS ----------- " + 
               "\nCosto de consumo : S/" + cosCsmA() +
               "\nImpuesto IGV : S/" + df.format(prcIgvA()) +
               "\nTOTAL A PAGAR : S/" + df.format(ttPgA()) + "\n";
    }
    
}
