package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
        public void testRemainWhenAmountLessThan1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(actual, expected);

    }

    @Test
    public void testRemainWhenAmountExactly1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;


        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainWhenAmountMoreThan1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);

    }
}
