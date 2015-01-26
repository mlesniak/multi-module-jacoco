package com.mlesniak.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Module2MainTest {
    @Test
    public void testModule2Function() throws Exception {
        Module2Main mainTest = new Module2Main();
        assertEquals(2, mainTest.module2FunctionTestedInModule2());
    }

    @Test
    public void testModule1Function() throws Exception {
        Module1Main main = new Module1Main();
        assertEquals(3, main.module1FunctionNotTestedInModule1());
    }
}
