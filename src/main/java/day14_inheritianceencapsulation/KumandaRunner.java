package day14_inheritianceencapsulation;

public class KumandaRunner {
    /*
    1)TV ekraninin genisligini,
yuksekligini ve ekran buyuklugunu
ayarlayabildiginiz
    2)kanal degistirebildiginiz;
kapatip acabildiginiz;
    3)ses azaltip artirabildiginiz ve
bu artirmanin bir max.
degerinin oldugu bir TV kumandasinin
kodunu yaziniz.
     */

    public static void main(String[] args) {
        Kumanda kumanda= new Kumanda(102.10,80.00,40.30);
        kumanda.gucDugmesi();
        System.out.println(kumanda.kanalDegistir(3));
        System.out.println(kumanda.sesAzaltma());
        System.out.println(kumanda.sesArtirma());
    }
}
