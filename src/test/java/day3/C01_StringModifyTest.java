package day3;

import day3.C01_StringModify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {

    C01_StringModify stringModify;

    @BeforeEach
    void setup(){
        stringModify =new C01_StringModify();
        System.out.println("BeforeEach calisti");
    }

    @AfterEach
    void tearDown(){
        stringModify=null;
        System.out.println("AfterEach calisti");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC,AABC","BA,ABA","BC,BAC"})
    void deleteIfItIsInFirstTwoPositionTest(String expected,String actual){
        assertEquals(expected,stringModify.deleteIfItIsInFirstTwoPosition(actual));
        System.out.println("Calisti");
    }

}
