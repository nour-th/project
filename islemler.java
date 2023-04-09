import java.io.*;
public class islemler {
 
 // Elit uye ekleme metodu
  public static void elitEkle(String dosya,String ad, String soyad, String mail){
    File file = new File(dosya);
      try {  
    // dosya okuma 
    BufferedReader reader = new BufferedReader(new FileReader(file));
    
    // birinci satiri tutma 
    StringBuilder sb = new StringBuilder();
    
    // yani satiri ekleme
    String existingFirstLine = reader.readLine();
    String newFirstLine = "\n"+ad+"\t"+soyad+"\t"+mail;
    if (existingFirstLine != null) {
        sb.append(existingFirstLine);
        sb.append(newFirstLine);                                                                                                                                                                                                
    } else {
        sb.append(newFirstLine);
    }
    PrintWriter writer = new PrintWriter(new FileWriter(file));
    writer.println(sb.toString());
    String line;
    while ((line = reader.readLine()) != null) {
        writer.println(line);
    }
    System.out.println("Basarili Eklendi");
    //dosyalari kapatma
    writer.close();
    reader.close();
  }catch (IOException e){}
}


// Genel uye eklme metodu
  public static void genelEkle(String dosya, String ad, String soyad, String mail){
        BufferedWriter bw = null;
        try {
          //dosya acma vaya olsturma
        File file = new File(dosya);
        if (!file.exists()){
        file.createNewFile();
        }
        //dosyanin icinde yazma
        FileWriter fw = new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write("\n");
        bw.write(ad);
        bw.write("\t");
        bw.write(soyad);
        bw.write("\t");
        bw.write(mail);
        System.out.println("Basarili Eklendi");
        // dosyayi kapatma
        bw.close();
        
        } 
        catch (IOException ioe) {
        ioe.printStackTrace();
        }
      }

   
   public static void oku(String dosya){
    try {
      File file = new File("kullanicilar.txt");
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String satir;
      while ((satir = bufferedReader.readLine()) != null) {
          System.out.println(satir);
      }

      bufferedReader.close();
      fileReader.close();
  } catch (IOException e) {
      e.printStackTrace();
  }

      }
    }