
package Maas;

public class SGK {
    private double SGK_Matrah;
    private double yuzdeYirmiBucuk; 
    private double yuzdeOnDort;
    private double yuzdeIki; 
    private double yuzdeBir; 

    public double getSGK_Matrah() {
        return SGK_Matrah;
    }

    public void setSGK_Matrah(Hakedisler hak) {
        this.SGK_Matrah = Sabitler.ASGARI_UCRET_ZAMLI+hak.getYemekYardimi()+hak.getBayramYardimi()+Sabitler.YAKACAK_YARDIM_UCRETİ;
                
    }    
    
            
    public double getYuzdeYirmiBucuk() {
        return getSGK_Matrah()*20.5/100;
    }


    public double getYuzdeOnDort() {
        return getSGK_Matrah()*14/100;
    }

    
    public double getYuzdeIki() {
        return getSGK_Matrah()*2/100;
    }

    
    public double getYuzdeBir() {
        return getSGK_Matrah()*1/100;
    }

    public void setYuzdeBir(double yuzdeBir) {
        this.yuzdeBir = yuzdeBir;
    }

    
    
    
    

    
    
    
    
    
}
