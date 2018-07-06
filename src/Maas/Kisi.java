package Maas;

public class Kisi {
    private String adSoyad; 
    private boolean medeniDurum; 
    private int cocukSayisi;

    public Kisi(String adSoyad, boolean medeniDurum, int cocukSayisi) {
        this.adSoyad = adSoyad;
        this.medeniDurum = medeniDurum;
        this.cocukSayisi = cocukSayisi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    
    
    
    public boolean isMedeniDurum() {
        //evlilik durumu
        return medeniDurum;
    }

    public void setMedeniDurum(boolean medeniDurum) {
        this.medeniDurum = medeniDurum;
    }

    public int getCocukSayisi() {
        return cocukSayisi;
    }

    public void setCocukSayisi(int cocukSayisi) {
        this.cocukSayisi = cocukSayisi;
    }
    
    
    
    
    
    
}
