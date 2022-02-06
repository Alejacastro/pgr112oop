package org.pgr112.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TroubleTest {
    
    @Test
    public void troubleTestBasic(){
        Trouble tr = new Trouble();
        int input = 5;
        
        int result = tr.sumNaturalNumbers(input);
        
        assertEquals(10, result);
    }

    @Test
    public void troubleTesterBasic2(){
        Trouble tr = new Trouble();
        int input = 10;

        int result = tr.sumNaturalNumbers(input);

        assertEquals(45, result);
    }

}
