package Gun03;

public class _04_JavaDataTypes {
    public static void main(String[] args) {


        int sayi; // hafızada int kadar yer ayırıyor, sadece tam sayı atılabiliyor.
        //  tam sayılarda default INT

        // tam sayılar
        byte byteDeger=7; // -128 127
        short shortDeger=1645; // -32000   ....32000
        int intDeger=250000;
        long LongDeger=232323232323232323L;

        // ondalıklı sayılar
        // ondalık sayılarda default+DOUBLE dır
        double doubleDeger=3.1445454555567; // noktadan son 16 hane duyarlıdır
        float floatDeger = 3.144343F;       // noktadan sonra 7 hane duyarlıdır

        // karakter ve karakterler
        char basHarf='A' ; // bir tane karakter saklayabilir
        String isim="Çağla"; // kelime veya cümle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("LongDeger = " + LongDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


    }
}
