package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class firma_bilgileri
{
    public static int kisiSayisiBulma(String dosyaYolu) throws IOException 
    {
        int kisiSayisi = 0;
        int toplam;

        FileReader fileReader = new FileReader("calisan.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String satir;
        while ((satir = bufferedReader.readLine()) != null)
        {
            kisiSayisi++;
        }

        bufferedReader.close();
        toplam= kisiSayisi-1;
        System.out.println("Bu şirkette toplam "+toplam+" tane personel bulunmaktadır.");
        return toplam;
    }
}
