package project;
import java.io.*;

public class yonetici_bilgileri
{
public static void yoneticiBilgisiEkle(String pozisyon, String isim, int yas) {
	try
	{
        PrintStream print = new PrintStream(new FileOutputStream("yoneticibilgileri.txt", true));
        print.println(pozisyon + "\t\t\t" + isim + "\t\t\t" + yas);
        print.close();
    } catch (IOException e)
	{
        e.printStackTrace();
    }
}
	
}

