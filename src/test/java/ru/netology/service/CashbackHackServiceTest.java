package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
        public void testRemainWhenAmountLessThan1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int expected = 100;
            int actual = service.remain(amount);
            assertEquals(actual, expected);

    }

    @Test
    public void testRemainWhenAmountExactly1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainWhenAmountMoreThan1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}
