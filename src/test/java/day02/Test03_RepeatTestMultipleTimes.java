package day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTimes {

    @RepeatedTest(5)
    void testSubString(){
        assertEquals("Java","Java cok guzel".substring(0,4));
        System.out.println("testStubString() calisti");
    }

    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
    }

    Random random=new Random();
    @RepeatedTest(5)
    @Disabled
    void TestMathAddExact(){
        int sayi1=random.nextInt(10);
        int sayi2=random.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1: "+sayi1+" sayi2= "+sayi2);
    }


}
