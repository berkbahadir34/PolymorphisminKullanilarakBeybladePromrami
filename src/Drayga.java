public class Drayga extends Beyblade {
    private String kutsalcanavar;

    public Drayga(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalcanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+ " "+ kutsalcanavar+ "Kutsal Canavarı Ortaya Çıkarıyor...");
        System.out.println(getBeybladeci()+ " ın Saldırısı: Kaplan Pençesi");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal Canavar Adı: "+kutsalcanavar);
    }
}
