package com.mlesniak.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Module1MainTest {

    @Test
    public void testModule1FunctionTestedInModule1() throws Exception {
        Module1Main main = new Module1Main();
        assertEquals(1, main.module1FunctionTestedInModule1());
    }
}
