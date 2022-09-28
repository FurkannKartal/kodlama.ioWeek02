package src.com.company;

public class Main {

    public static void main(String[] args) {
	    String mesaj ="Bugün Salı günü";
       // String yenimesaj=mesaj.substring(0,2);
        String yenimesaj=sehir();
        System.out.println(yenimesaj);
        int sayi = topla(5,6);
        System.out.println(sayi);
        int toplam2=topla2(2,3,5,1,6,7);
        System.out.println(toplam2);
    }
    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silinde");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehir() {
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
}
