package com.github.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalc {
    @Test
    public void  test1(){
        assertEquals(3 ,new Calc().add(1, 2));
    }

    @Test
    public void  test2(){
        assertEquals((double) 2,new Calc().division(4, 2),0);
    }
}
