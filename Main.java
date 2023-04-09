import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      // dosyanin adresi 
      String dosya = "C:/Users/STC/java_projects/kullanicilar.txt";
      //Ekrana ilk yazilacak liste
        System.out.println("1- Elit Uye Ekleme");
        System.out.println("2- Genel Uye Ekleme");
        System.out.println("3- Mail Gonderme");
        System.out.println("Yapmak istediginiz islem numarasini giriniz");  
        // input almak icin
        Scanner in = new Scanner(System.in);
        int islem = in.nextInt();
        // islemler classindaki matodlari cagirabilmem icin object olusturdum
        islemler yap = new islemler();
  

        if(islem==1){
          System.out.println("Adinizi giriniz:");
          String ad = in.next();
          System.out.println("Soyadinizi giriniz:");
          String soyad = in.next();
          System.out.println("Mail adresinizi giriniz:");
          String mail = in.next();
          yap.elitEkle(dosya,ad, soyad, mail);
        }

        else if(islem==2){
          System.out.println("Adinizi giriniz:");
          String ad = in.next();
          System.out.println("Soyadinizi giriniz:");
          String soyad = in.next();
          System.out.println("Mail adresinizi giriniz:");
          String mail = in.next();
          yap.genelEkle(dosya, ad,soyad,mail);
       }         

        else if(islem==3){
        System.out.println("1- Elit Uyelere Mail");
        System.out.println("2- Genel Uyelere Mail");
        System.out.println("3- Tum Uyelere Mail");
        System.out.println("Yapmak istediginiz islem numarasini giriniz");  
        int islem2 = in.nextInt();
        System.out.println("Mail bilgisi giriniz:");
        String mailBligi = in.next();
        Gonder at = new Gonder();
           if(islem2==1)
            at.elitUyelereMailAt(dosya);

           else if(islem2==2)
            at.genelUyelereMailAt(dosya);

           else if(islem==3)
            at.tumUyelereMailAt(dosya);
   
       }
    }
}