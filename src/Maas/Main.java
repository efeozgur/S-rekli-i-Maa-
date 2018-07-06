package Maas;

public class Main {
    public static void main(String[] args) 
    {
       GunHesabi gun = new GunHesabi(22,18,8,30);
       Kisi kisi = new Kisi("Kemal Yılmaz", true, 0);
       SGK sgk = new SGK();
       AGI agi = new AGI();
       Kesintiler kesintiler = new Kesintiler();
       Hakedisler hakedis= new Hakedisler();
       
       /*
       bu deneme satırı masaüstü bilgisayardan değiştirildi....
       çok satırlı açıklama satırları
       
       bu satırda laptopta yazıldı. 
       */
       
       hakedis.setGunlukUcret(gun);
       hakedis.setBayramYardimi(true);
       hakedis.setYemekYardimi(gun);
       kesintiler.setAsgariGecimIndirimi(agi, 1);
       hakedis.setCocukYardimi(gun, kisi);
       sgk.setSGK_Matrah(hakedis);
       kesintiler.setGV_Matrahi(sgk);
       kesintiler.setDamgaVergisi(hakedis);
       kesintiler.setKesintilerToplami(sgk);
       hakedis.setToplamTahakkuk(sgk);       
       
       
       System.out.println(kisi.getAdSoyad()+" kişisine ait maaş dökümü");
       System.out.println("********************************************");       
       System.out.println("Günlük Ücret : " + hakedis.getGunlukUcret());
       System.out.println("Yemek Yardımı : " + hakedis.getYemekYardimi());
       System.out.println("Çocuk Yardımı : " + hakedis.getCocukYardimi());
       System.out.println("Yakacak Yardımı : " + Sabitler.YAKACAK_YARDIM_UCRETİ);
       System.out.println("Bayram Yardımı : " + hakedis.getBayramYardimi());      
       System.out.println("Hakediş Toplamı : " + hakedis.hakedisToplami());       
       System.out.println("***********************************************");   
       
       System.out.println("SGK Matrahı : " + sgk.getSGK_Matrah());       
       System.out.println("%20.5 : " + sgk.getYuzdeYirmiBucuk());
       System.out.println("%14 : " + sgk.getYuzdeOnDort());
       System.out.println("%2 : " + sgk.getYuzdeIki());
       System.out.println("%1 : " + sgk.getYuzdeBir());      
       System.out.println("***********************************************");
       
       System.out.println("Toplam Tahakkuk : " + hakedis.getToplamTahakkuk());
       
       System.out.println("**************Kesintiler***********************");   
       
       System.out.println("Gelir Vergisi Matrahı : " + kesintiler.getGV_Matrahi());
       System.out.println("Asgari Geçim İndirimi Tutarı : " + kesintiler.getAsgariGecimIndirimi());       
       System.out.println("Gelir Vergisi  : " + kesintiler.getGelirVergisi());
       System.out.println("Damga Vergisi  : " + kesintiler.getDamgaVergisi());
       System.out.println("Kesintiler Toplamı : " + kesintiler.getKesintilerToplami());
       System.out.println("Net Ödenen : " + hakedis.netOdenen(kesintiler));
    }
}
    