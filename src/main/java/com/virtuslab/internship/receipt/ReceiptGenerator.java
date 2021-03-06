package com.virtuslab.internship.receipt;

import com.virtuslab.internship.basket.Basket;

import java.util.ArrayList;
import java.util.List;

public class ReceiptGenerator {

    public Receipt generate(Basket basket) {
        var receipt = getReceipt(basket);
        return receipt;
    }

    private Receipt getReceipt(Basket basket) {
        List<ReceiptEntry> receiptEntries = new ArrayList<>();
        return new Receipt(receiptEntries);
    }
}
