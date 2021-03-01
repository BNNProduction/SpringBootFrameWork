package training.workshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoServiceTest {

    @Test
    @DisplayName("ในการทำงานต้อง random ได้ค่า 5")
    public void random_5() {
        DemoService demoService = new DemoService();
        demoService.setRandom(new Random5());
        String actualResult =demoService.generateData("somkiat");
        assertEquals("somkiat5", actualResult);
    }
    
    @Test
    @DisplayName("ในการทำงานต้อง random return RuntimeException")
    public void random_throw() {
        DemoService demoService = new DemoService();
        demoService.setRandom(new Random15());
       // String actualResult =demoService.generateData("somkiat");
        
       //assertThrows(RuntimeException.class);
        assertThrows(RuntimeException.class, () -> {
        	demoService.generateData("somkiat");
        });
       // assertEquals("somkiat5", actualResult);
    }
}

class Random5 extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}

class Random15 extends Random {
    @Override
    public int nextInt(int bound) {
        return 15;
    }
}