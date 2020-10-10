public class Dragon extends Beyblade {
    private String kutsalcanavar;
    private String gizliyetenek;

    public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalcanavar, String gizliyetenek) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalcanavar = kutsalcanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+ " "+ kutsalcanavar+ "Kutsal Canavarı Ortaya Çıkarıyor...");
        System.out.println(getBeybladeci()+ " ın Saldırısı: Hayalet Kasırgası");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal Canavar Adı: "+kutsalcanavar);
        System.out.println("Gizli Yetenek :"+gizliyetenek);
    }
}
