import java.util.Scanner;

// Login sınıfı, kullanıcı girişini kontrol eden bir sınıftır
public class Login {

    // Hesap nesnesini kullanarak kullanıcı girişini kontrol eden metot
    public boolean login (Hesap hesap){

        // Scanner sınıfı ile kullanıcıdan veri almak için kullanılır
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        // Kullanıcıdan kullanıcı adını ve parolayı alır
        System.out.print("Kullanici adi giriniz: ");
        kullanici_adi = scanner.nextLine();
        System.out.print("Parola giriniz: ");
        parola= scanner.nextLine();

        // Hesaptaki bilgilerle kullanıcının girdiği bilgileri karşılaştırır
        if( hesap.getKullanici_adi().equals(kullanici_adi)  && hesap.getParola().equals(parola) ){
            return true; // Eğer bilgiler eşleşiyorsa true döner
        } else {
            return false; // Eğer bilgiler eşleşmiyorsa false döner
        }
    }
}
