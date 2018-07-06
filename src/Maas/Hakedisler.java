
package Maas;

public class Hakedisler {

    private double gunlukUcret;
    private double yemekYardimi; 
    private double cocukYardimi; 
    private double bayramYardimi; 
    private double toplamTahakkuk; 
    private double asgariGecimIndirimi; 
    
    
    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(GunHesabi gun) {
        this.gunlukUcret = Sabitler.ASGARI_UCRET_ZAMLI/gun.getToplamGun(); 
    }

    public double getYemekYardimi() {
        return yemekYardimi;
    }

    public void setYemekYardimi(GunHesabi gun) {
        this.yemekYardimi = Sabitler.YEMEK_YARDIM_UCRETİ*gun.getYemekVerilecekGun();;
    }

    public double getCocukYardimi() {
        return cocukYardimi;
    }

    public void setCocukYardimi(GunHesabi gun, Kisi kisi) {
        this.cocukYardimi = (Sabitler.COCUK_YARDIM_UCRETİ*kisi.getCocukSayisi()/gun.getToplamGun()* gun.getToplamGun());
    }

    public double getBayramYardimi() {
        return bayramYardimi;
    }

    public void setBayramYardimi(boolean bayramYardimi) {
        if (bayramYardimi) {
            this.bayramYardimi = Sabitler.BAYRAM_YARDIM_UCRETİ;
        } else {
            this.bayramYardimi = 0; 
        }
    }
    
    
    
    public double hakedisToplami(){
        return getYemekYardimi()+getBayramYardimi()+getCocukYardimi()+Sabitler.ASGARI_UCRET_ZAMLI + Sabitler.YAKACAK_YARDIM_UCRETİ;
    }
    

    public double getToplamTahakkuk() {
        return toplamTahakkuk;
    }

    public void setToplamTahakkuk(SGK sgk) {
        this.toplamTahakkuk = hakedisToplami()+ sgk.getYuzdeYirmiBucuk()+sgk.getYuzdeIki();
    }
    
    
    public double netOdenen(Kesintiler kes) {
       return getToplamTahakkuk()-kes.getKesintilerToplami();
    }

    

}
