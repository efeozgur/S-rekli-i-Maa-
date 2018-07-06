package Maas;

public class AGI {
   public double asgariGecim(int x){
       switch (x) {
           case 1:
               return Sabitler.BEKAR;
           case 2:
               return Sabitler.EVLI_ESI_CALISMAYAN;
           case 3:
               return Sabitler.EVLI_ESI_CALISMAYAN_1_COCUK;
           case 4:
               return Sabitler.EVLI_ESI_CALISMAYAN_2_COCUK;
           case 5:
               return Sabitler.EVLI_ESI_CALISMAYAN_3_COCUK;
           case 6:
               return Sabitler.EVLI_ESI_CALISMAYAN_4_COCUK;
           case 7:
               return Sabitler.EVLI_ESI_CALISMAYAN_5_COCUK;
           case 8:
               return Sabitler.EVLI_ESI_CALISAN;
           case 9:
               return Sabitler.EVLI_ESI_CALISAN_1_COCUK;
           case 10:
               return Sabitler.EVLI_ESI_CALISAN_2_COCUK;
           case 11:
               return Sabitler.EVLI_ESI_CALISAN_3_COCUK;
           case 12:
               return Sabitler.EVLI_ESI_CALISAN_4_COCUK;
           case 13:
               return Sabitler.EVLI_ESI_CALISAN_5_COCUK;
           default:
               return 1; 
       }
} 
}
