/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Purchase;

public class MockPurchaseDao {

    List<Purchase> purchases = new ArrayList<>();

   public void insertPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

   public void updatePurchase(Purchase purchase) {
        Optional<Purchase> first =
                purchases.stream().filter(request -> request.getId() == purchase.getId()).findFirst();
        if (first.isPresent()) {
            Purchase old = first.get();
            purchases.remove(old);
            purchases.add(purchase);
        }
    }

}
