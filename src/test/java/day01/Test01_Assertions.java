package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){
        /*
            Junit 5 ile beraber methodlar public ile belirtilmesi zorunlulugu ortadan kalkti.
         */
    }

    /*
        test isimlendirmelerinde method isminin test ile baslamasi kabul gormustur ama farkli isimlendirme yapilabilir.
     */

    @Test
    public void testLength(){
        String kelime="Merhaba Dunya";
        int anlikDeger=kelime.length();
        int beklenenDeger=13; // expected --> beklenen
        assertEquals(anlikDeger,beklenenDeger);
    }

    @Test
    public void testUpperCase(){
        String anlikDeger="Merhaba".toUpperCase();
        String beklenenDeger="MERHABA";
        // assertEquals(anlikDeger,beklenenDeger);
        assertEquals(beklenenDeger,anlikDeger,"UpperCase() methodu duzgun calismadi");
    }

    @Test
    void testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beknenDeger=15;
        assertEquals(beknenDeger,anlikDeger);
    }

    @Test
    void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }



}
