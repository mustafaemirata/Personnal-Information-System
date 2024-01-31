package project;
import java.util.Scanner;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException 
    {

        System.out.println("Yapılacak işlemi seçiniz.");
        System.out.println("1. Personel Ekleme \n2. Yönetici Ekle\n3. İşten Çıkarma\n4. Firma Bilgileri");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();

        switch (secim)
        {
            case 1:
                Scanner personelScanner = new Scanner(System.in);
                boolean devam = true;
                while (devam) 
                {
                    System.out.println("Eklemek istediğiniz personel ismini giriniz. veya çıkmak için 0'a basınız:");
                    String personel = personelScanner.nextLine();
                    if (personel.equals("0"))
                    {
                        devam = false;
                    } else
                    {
                        System.out.println("Eklemek istediğiniz personel yaşını giriniz.");
                        String personelyas = personelScanner.nextLine();
                        System.out.println("Eklemek istediğiniz personel maaşını giriniz.");
                        int personelmaas = personelScanner.nextInt();

                        calisan_bilgileri.calisanBilgileriEkle(personel, personelyas, personelmaas);
                        System.out.println("Personel başarıyla eklendi.");
                    }
                }
                break;
            case 2:
            	Scanner yoneticiScanner = new Scanner(System.in);
                boolean devam1 = true;
                while (devam1) 
                {
                    System.out.println("Eklemek istediğiniz pozisyon giriniz. veya çıkmak için 0'a basınız:");
                    String pozisyon = yoneticiScanner.nextLine();
                    if (pozisyon.equals("0"))
                    {
                        devam1 = false;
                    } else
                    {
                        System.out.println("Eklemek istediğiniz ismi giriniz.");
                        String pozisyonisim = yoneticiScanner.nextLine();
                        System.out.println("Eklemek istediğiniz ismin yaşını giriniz.");
                        int pozisyonyas = yoneticiScanner.nextInt();

                        yonetici_bilgileri.yoneticiBilgisiEkle(pozisyon, pozisyonisim, pozisyonyas);
                        System.out.println("Personel başarıyla eklendi.");
                    }
                }
                break;
            case 3:
              calisansilme.main(args);
                break;
            case 4:
            	   firma_bilgileri.kisiSayisiBulma("dosya.txt");
                break;
            default:
                System.out.println("Geçersiz seçenek!");
        }
    }
}
