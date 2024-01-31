package project;

import java.io.*;

public class calisansilme {
    public static void main(String[] args) {
        try
        {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Silinecek çalışanın adını girin: ");
            String silinecekCalisanAdi = br.readLine().trim();

       
            File originalFile = new File("calisan.txt");
            File tempFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
          
            boolean silindi = false;
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
           
                if (currentLine.contains(silinecekCalisanAdi)) {
                    silindi = true;
                    continue; // Bu satırı atlayın (yani silin)
                }
          
                writer.write(currentLine + System.getProperty("line.separator"));
            }


            writer.close();
            reader.close();

           
            if (originalFile.delete())
            {
                if (!tempFile.renameTo(originalFile)) {
                    throw new IOException("Geçici dosya, orijinal dosya adına yeniden adlandırılamadı.");
                }
                System.out.println("Belirtilen çalışan dosyadan başarıyla silindi.");
            } else 
            {
                throw new IOException("Orijinal dosya silinemedi.");
            }

            // Durumu kullanıcıya bildir
            if (!silindi)
            {
                System.out.println("Belirtilen çalışan dosyada bulunamadı.");
            }
        } catch (IOException e) 
        {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}
