package com.calculator.controller;

import com.calculator.helper.CalcHelper;

/**
 * Created by malleswari on 18/07/17.
 */
public class CalculatorDemo {

    private static final CalcHelper calcHelper = new CalcHelper();

    public static void main (String[] args) {

        int sum = calcHelper.add(2,3);

    }
}
