
package Maas;

public class GunHesabi {
    private int normalGun; 
    private int yemekVerilecekGun; 
    private int haftaTatili; 
    private int toplamGun; 

    public GunHesabi(int normalGun, int yemekVerilecekGun, int haftaTatili, int toplamGun) {
        this.normalGun = normalGun;
        this.yemekVerilecekGun = yemekVerilecekGun;
        this.haftaTatili = haftaTatili;
        this.toplamGun = toplamGun;
    }

    public int getNormalGun() {
        return normalGun;
    }

    public void setNormalGun(int normalGun) {
        this.normalGun = normalGun;
    }

    public int getYemekVerilecekGun() {
        return yemekVerilecekGun;
    }

    public void setYemekVerilecekGun(int yemekVerilecekGun) {
        this.yemekVerilecekGun = yemekVerilecekGun;
    }

    public int getHaftaTatili() {
        return haftaTatili;
    }

    public void setHaftaTatili(int haftaTatili) {
        this.haftaTatili = haftaTatili;
    }

    public int getToplamGun() {
        return toplamGun;
    }

    public void setToplamGun(int toplamGun) {
        this.toplamGun = toplamGun;
    }
    
    
    
    
    
    
}
