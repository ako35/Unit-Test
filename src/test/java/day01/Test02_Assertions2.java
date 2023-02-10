package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {

    @Test
    void testToFindMin(){
        // assertEquals(14,Math.min(14,17));
        // assertTrue(11.5==Math.min(11.5,14.4));
        assertFalse(Math.min(12.3,13.5) !=12.3);
    }

    @Test
    void testArrays(){
        String str="Test islemi cok kolay";
        String[] anlikDizi=str.split(" ");
        String[] beklenenDizi={"Test","islemi","cok","kolay"};
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

}
