package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void testRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual,expected);
    }

    @org.junit.Test
    public void testWhithCahbackRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals (actual,expected);
    }

    @org.junit.Test
    public void testWhithCahbackRemainNull () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals (actual,expected);
    }

    @org.junit.Test
    public void testWhithCahbackRemainMore1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals (actual,expected);
    }

}

