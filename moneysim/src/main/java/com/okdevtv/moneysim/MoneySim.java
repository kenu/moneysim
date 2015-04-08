package com.okdevtv.moneysim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenu on 2015-04-08.
 */
public class MoneySim {
    private List<Item> itemList;
    public void addItem(Item item) {
        if (itemList == null) {
            itemList = new ArrayList<Item>();
        }
        itemList.add(item);
    }

    public long sumAfter(int months) {
        long sum = 0;
        for (int i = 0; i < months; i++) {
            sum += monthlyTotal();
        }
        return sum;
    }

    public long monthlyTotal() {
        long total = 0;
        for (Item item: itemList) {
            total += item.getAmount();
        }
        return total;
    }
}
