package Maas;

public class SosyalYardim {
    private double yolYardimi,yemekYardimi,cocukYardimi,yakacakYardimi, bayramYardimi; 
    private int calisilanGun; 

    public double getCalisilanGun() {
        return calisilanGun;
    }

    public void setCalisilanGun(int calisilanGun) {
        this.calisilanGun = calisilanGun;
    }

    public double getYolYardimi() {
        return Sabitler.YOL_YARDIM_UCRETİ * calisilanGun;
    }

    public double getYemekYardimi() {
        return yemekYardimi;
    }

    public double getCocukYardimi() {
        return cocukYardimi;
    }

    public double getYakacakYardimi() {
        return yakacakYardimi;
    }

    public double getBayramYardimi() {
        return bayramYardimi;
    }
    
}
