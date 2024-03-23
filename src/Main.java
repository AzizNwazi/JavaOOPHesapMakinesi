// Ana sınıf, programın başlangıcını ve ATM işlemlerini başlatır
public class Main {

    public static void main(String[] args) {

        // ATM sınıfından bir nesne oluşturulur
        ATM atm = new ATM();

        // Hesap sınıfından bir nesne oluşturulur ve kullanıcı bilgileri ile başlatılır
        Hesap hesap = new Hesap("Mustafa Murat", "1234", 2000);

        // Oluşturulan ATM nesnesi üzerinden ATM işlemleri başlatılır
        atm.calis(hesap);

        System.out.println("\nProgramdan cikis yapiliyor ...\n");
    }
}
