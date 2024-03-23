import java.util.Scanner;

// ATM sınıfı, kullanıcı işlemlerini ve ATM işleyişini yönetir
public class ATM {

    // Hesap nesnesi üzerinden ATM'nin çalışmasını sağlayan metot
    public void calis(Hesap hesap){

        // Login sınıfı ile kullanıcı girişini kontrol etme
        Login login = new Login();

        // Kullanıcıdan veri almak için Scanner sınıfı
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bankamiza hos geldiniz....");
        System.out.println("**************************************");
        System.out.println("Kullanici Girisi");
        System.out.println("**************************************");

        // Kullanıcının üç giriş hakkı
        int girisHakki = 3 ;

        // Kullanıcı girişini kontrol etme döngüsü
        while(true){

            // Giriş başarılıysa döngüden çık
            if(login.login(hesap)){
                System.out.println("Giris Basarili...");
                break;
            }
            // Giriş başarısızsa kullanıcıya bilgi ver ve giriş hakkını azalt
            else{
                System.out.println("Giris Basarisiz...");
                girisHakki-=1;
                System.out.println("Klana giris hakki: "+ girisHakki);
            }
            // Giriş hakkı tükendiğinde döngüden çık
            if(girisHakki == 0){
                return;
            }
        }

        System.out.println("**************************************");
        // Kullanıcıya sunulan işlem seçenekleri
        String islemler=   ("1.Bakiye Goruntuleme\n"+
                "2.Para Yatirmak\n"+
                "3.Para Cekmek\n"+
                "Cikis icin 'q'");
        System.out.println(islemler);
        System.out.println("**************************************");

        // Kullanıcının seçtiği işlemi gerçekleştirmek için döngü
        while(true){

            System.out.println("Islem seciniz: ");
            String islem =scanner.nextLine();

            // Kullanıcı çıkış seçeneğini seçerse döngüden çık
            if( islem.equals("q")){
                break;
            }
            // Bakiye sorgulama işlemi
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+ hesap.getBakiye());

            }
            // Para yatırma işlemi
            else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutari giriniz: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();

                hesap.paraYatir(tutar);

            }
            // Para çekme işlemi
            else if(islem.equals("3")){
                System.out.print("Cekmek istediginiz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();

                hesap.paraCek(tutar);

            }
            // Geçersiz işlem seçeneği
            else{
                System.out.println("Gecersiz islem....");
            }
        }
    }
}