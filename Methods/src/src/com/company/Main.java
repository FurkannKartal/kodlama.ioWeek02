package src.com.company;

public class Main {

    public static void main(String[] args) {
sayibulmaca();
    }
    public static void sayibulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =6;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi =true;
                break;
            }
        }
        if (varMi){
            mesaj(aranacak);
        }else
            System.out.println("Sayi mevcut degildir");
    }
    public static void mesaj(int aranacak){
        System.out.println("Sayi mevcuttur"+ aranacak);
    }
}
