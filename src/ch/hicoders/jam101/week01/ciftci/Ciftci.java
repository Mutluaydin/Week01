package ch.hicoders.jam101.week01.ciftci;
import ch.hicoders.jam101.week01.ciftlik.Inek;
import ch.hicoders.jam101.week01.ciftlik.Tavuk;


public class Ciftci {
    public static void main(String[] args) {
        Inek inek1 = new Inek("inek1");
        Inek inek2 = new Inek("inek2");
        Tavuk tavuk1 = new Tavuk("tavuk1");
        System.out.println("Inek isimleri "  + inek1 + inek2);
        System.out.println("Tavuk sayilari " + tavuk1);
        System.out.println("Toplam inek sayisi " + Inek.inekSayiTop);
        System.out.println("Toplanm Tavuk Sayisi " + Tavuk.tavukSay);


    }
}

