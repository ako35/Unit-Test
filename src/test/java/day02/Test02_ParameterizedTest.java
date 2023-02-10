package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {

    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Seyma".length()>0);
        assertTrue("Beyza".length()>0);
        assertTrue("Omer".length()>0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Osman","Seyma","Beyza","Omer"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }

    @Test
    void testUpperCase(){
        String str1="Merhaba";
        String str2="Java";
        String str3="Test";
        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA,Merhaba",
            "JAVA,Java",
            "TEST,Test"
    })
    void testUpperCase2(String str1,String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "true,java,a",
            "true,junit,u",
            "false,hello,a"
    })
    void testContains(boolean key, String value,String ch){
        assertEquals(key,value.contains(ch));
    }

}
