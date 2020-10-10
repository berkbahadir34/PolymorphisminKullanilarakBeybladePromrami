public class Draciel  extends Beyblade{
    private String kutsalcanavar;

    public Draciel(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalcanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+ " "+ kutsalcanavar+ "Kutsal Canavarı Ortaya Çıkarıyor...");
        System.out.println(getBeybladeci()+ " ın Savunması: Kale Savunması");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal Canavar Adı: "+kutsalcanavar);
    }
}
