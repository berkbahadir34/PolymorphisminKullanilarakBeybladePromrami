import java.util.Scanner;

public class Test {

    public static void main(String[] argc){
        System.out.println("Beyblade Programına Hoşgeldiniz....");
        System.out.println("Çıkış İçin q'a basın...");
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Hangi Beybladeyi Üretmek İstiyorsunuz?");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor");
                break;
            }
            else{
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade= fabrika.beybladeUret(islem);
                if(beyblade==null){
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Girin....");
                }
                else{
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }

        }


    }
}
