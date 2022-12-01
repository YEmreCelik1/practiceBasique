package day14_inheritianceencapsulation;

public class Kumanda {
    private double genislik;
    private double yukseklik;
    private double ekranBuyukluk;
    private int maxVolume=30;
    private int volume=11;
    private boolean guc;

    public Kumanda(double genislik, double yukseklik, double ekranBuyukluk){
        this.genislik=genislik;
        this.yukseklik=yukseklik;
        this.ekranBuyukluk=ekranBuyukluk;
    }
    public double kanalDegistir(int kanalNo){

        switch (kanalNo){
            case 1:
                return 34.75;

            case 2:
                return 45.23;

            case 3:
                return 50.33;

        }
        return 0;

    }
    public void gucDugmesi(){
        this.guc=!guc;
    }
    public int sesAzaltma(){
        if(volume>0){
            volume--;
        }
        return volume;
    }

    public int sesArtirma(){
        if(maxVolume>volume){
            volume++;
        }
        return volume;
    }
}
