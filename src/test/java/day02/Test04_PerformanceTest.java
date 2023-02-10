package day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test04_PerformanceTest {

    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(2),()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));
    }

    @Test
    void testPerformance(){
        assertTimeout(Duration.ofSeconds(1),()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
    }

}
