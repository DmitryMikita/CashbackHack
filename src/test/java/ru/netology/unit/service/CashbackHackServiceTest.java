package ru.netology.unit.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void purchaseLessThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 800;
        int expected = 200;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1700;
        int expected = 300;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseEqualToThousand() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1000;
        int expected = 0;
        int actual = service.remain(boundary);
        Assert.assertEquals(actual, expected);
    }
}
