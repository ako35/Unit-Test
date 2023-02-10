package day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll calisti");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll calisti");
    }

    @Test
    void testArrays(TestInfo info){
        String str="Unit Test with Junit";
        String[] anlikDizi=str.split(" ");
        String[] beklenenDizi={"Unit","Test","with","Junit"};
        System.out.println(info.getDisplayName()    +" calisti");
        assertArrayEquals(beklenenDizi,anlikDizi,"Diziler birbirine esit degil");
    }

    @Test
    void testArrays2(TestInfo info){
        String str="Unit Test with Junit";
        int anlikDeger=str.split(" ").length;
        int beklenenDeger=4;
        System.out.println(info.getDisplayName()    +" calisti");
        assertEquals(beklenenDeger,anlikDeger);
    }

}
