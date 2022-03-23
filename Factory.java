package com;

public class Factory {

    public static int karakterSayisi=5; //Kaç haneli isim oluşturulacak
    public static int tekrarSayisi=0;
    public int baslangicBelirle;
    private String olusturulanIsim ="";                           //program %50 ihtimalle sesli yada sessiz harfle başlar ve bu duruma göre bir sesli bir sessiz şeklinde devam ederek yeni kelimeler oluşturur.

    public static String[] sesli = {"A","E","I","U","O"};
    public static String[] sessiz = {"B","C","D","F","G","H","J","K","L","M","N","P","R","S","T","V","W","Y","Z","X"};

    public void createNickname(){

        while(tekrarSayisi < 100) { // kaç adet isim oluşturulsun ? 

        //birden fazla seçenekte isim oluşturulmak isteniyorsa  karakterSayisi = (int)(Math.random()*5+3); şeklinde kullanılabilir
          baslangicBelirle =  (int)(Math.random()*100 );

        if(baslangicBelirle %2 == 0){
            sesliUret();
        }
        else {
            sessizUret();
        }
        for(int i = 0; i < karakterSayisi-1; i++){
        if(baslangicBelirle%2 == 0){
            sessizUret();
            baslangicBelirle++;
        }
        else{
            sesliUret();
            baslangicBelirle++;
        }

        }
            tekrarSayisi++;
        System.out.println(tekrarSayisi+"-"+olusturulanIsim);
        olusturulanIsim = "";
        }
    }
    public void sesliUret(){
       int index = (int)(Math.random()*sesli.length);
       olusturulanIsim += sesli[index];
    }
    public void sessizUret(){
        int index = (int)(Math.random()*sessiz.length);
        olusturulanIsim += sessiz[index];
    }

}
