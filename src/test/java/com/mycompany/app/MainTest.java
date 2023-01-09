package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class MainTest {

    @Test
    public void TestIsGreaterThanSixTrue() {

      boolean acctualResult = ScoreManager.isGreaterThanSix(7);
      assertTrue(acctualResult);
    }

    @Test
    public void TestIsGreaterThanSixFalse() {

      boolean acctualResult = ScoreManager.isGreaterThanSix(2);
      assertFalse(acctualResult);

    }
}