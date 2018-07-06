package Maas;

public class Kesintiler {
    
    private double GV_Matrahi;
    private double gelirVergisi; 
    private double damgaVergisi; 
    private double kesintilerToplami;
    private double asgariGecimIndirimi;
    
    public double getGV_Matrahi() {
        return GV_Matrahi;
    }

    public void setGV_Matrahi(SGK sgk) {
        this.GV_Matrahi = Sabitler.ASGARI_UCRET_ZAMLI-(sgk.getYuzdeOnDort()+sgk.getYuzdeBir());
    }

    public double getAsgariGecimIndirimi() {
        return asgariGecimIndirimi;
    }
    
    public void setAsgariGecimIndirimi(AGI agi, int i) {
    
        this.asgariGecimIndirimi = agi.asgariGecim(i);
    }    
    
    
    public double getGelirVergisi() {        
        
        if (getGV_Matrahi()>0 && getGV_Matrahi()<Sabitler.GV_ORAN_1) {       
            double donen = (getGV_Matrahi()*15/100)-(getAsgariGecimIndirimi());
            return donen;
        } else if(getGV_Matrahi()>=Sabitler.GV_ORAN_1 && getGV_Matrahi()<Sabitler.GV_ORAN_2) {
            double ilk = (getGV_Matrahi()-Sabitler.GV_ORAN_1)*20/100;
            return ilk+2200;
        } else if(getGV_Matrahi()>=Sabitler.GV_ORAN_2 && getGV_Matrahi()<Sabitler.GV_ORAN_3) {
            double ilk = (getGV_Matrahi()-Sabitler.GV_ORAN_2)*27/100;
            return ilk + 6060;
        } else if(getGV_Matrahi()>=Sabitler.GV_ORAN_3) {
            double ilk = (getGV_Matrahi()-Sabitler.GV_ORAN_3)*35/100;
            return ilk+18480;
        } else {
            return 0; 
        }
    }

    


    


    public double getDamgaVergisi() {
        return damgaVergisi;
    }

    public void setDamgaVergisi(Hakedisler hak) {
        this.damgaVergisi = hak.hakedisToplami()*0.00759;
    }  
    
    public double getKesintilerToplami() {
        return kesintilerToplami;
    }

    public void setKesintilerToplami(SGK sgk) {
        this.kesintilerToplami = (getGelirVergisi()+getDamgaVergisi()+sgk.getYuzdeYirmiBucuk()+sgk.getYuzdeOnDort()+sgk.getYuzdeIki()+sgk.getYuzdeBir());
    }
    
}
