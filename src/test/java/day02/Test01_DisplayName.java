package day02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_DisplayName {

    @Test
    @DisplayName("parseInt() methoduna numeric olmayan arguman gonderildiginde firlatilan exception i test eden method")
    void testException(){
        String str="Merhaba";
        assertThrows(NumberFormatException.class,()->{
            Integer.parseInt(str);
        });
    }



}
