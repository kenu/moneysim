package com.okdevtv.moneysim;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * Created by kenu on 2015-04-08.
 */
public class MoneySimTest {
    @Test
    public void testAddItem() {
        MoneySim moneySim = new MoneySim();
        Item item = new Item();
        item.setLabel("주택청약");
        item.setAmount(20000);
        moneySim.addItem(item);

        assertThat(moneySim.sumAfter(3), is(60000L));

        Item item2 = new Item();
        item2.setLabel("SKT 통신비");
        item2.setAmount(100000L);
        moneySim.addItem(item2);
        assertThat(moneySim.sumAfter(3), is(360000L));

        assertThat(moneySim.monthlyTotal(), is(120000L));
    }
}
