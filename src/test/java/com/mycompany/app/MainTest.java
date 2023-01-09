package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class MainTest {

    @Test
    public void TestIsGreaterThanSixTrue() {

      boolean acctualResult = ScoreManager.isGreaterThanSix(7);
      assertTrue(acctualResult);

    }

}