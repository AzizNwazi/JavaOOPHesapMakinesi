// Hesap sınıfı, kullanıcı hesap bilgilerini ve hesap işlemlerini yönetir
public class Hesap {

    // Kullanıcı adı
    private String kullanici_adi;

    // Kullanıcı parolası
    private String parola;

    // Hesaptaki bakiye
    private int bakiye;

    // Hesap sınıfının yapıcı metodu (constructor)
    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    // Kullanıcı adını getiren metot
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    // Kullanıcı adını set eden metot
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    // Kullanıcı parolasını getiren metot
    public String getParola() {
        return parola;
    }

    // Kullanıcı parolasını set eden metot
    public void setParola(String parola) {
        this.parola = parola;
    }

    // Hesaptaki bakiyeyi getiren metot
    public int getBakiye() {
        return bakiye;
    }

    // Hesaptaki bakiyeyi set eden metot
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    // Hesaba para yatırma işlemini gerçekleştiren metot
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    // Hesaptan para çekme işlemini gerçekleştiren metot
    public void paraCek(int tutar){
        // Yeterli bakiye yoksa uyarı mesajı yazdırma
        if(bakiye - tutar < 0){
            System.out.println("Yeterli bakiyeniz yok ....");
            System.out.println("Bakiyeniz: "+ bakiye);
        } else {
            // Yeterli bakiye varsa para çekme işlemini gerçekleştirme
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: "+ bakiye);
        }
    }
}