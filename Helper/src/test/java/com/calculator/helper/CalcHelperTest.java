package com.calculator.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by malleswari on 18/07/17.
 */
public class CalcHelperTest {

    private static CalcHelper calcHelper;

    @Before
    public void setUp() {
        calcHelper = new CalcHelper();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(5, calcHelper.add(2,3));
        assertEquals(5, calcHelper.add(2,2));
    }

}