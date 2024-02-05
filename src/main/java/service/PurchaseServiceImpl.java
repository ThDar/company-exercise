/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.IPurchaseDao;
import dao.MockPurchaseDao;
import model.Purchase;

public class PurchaseServiceImpl implements PurchaseService {

    private static final Logger LOG = null;

    private final MockPurchaseDao daoPurchase;

    public PurchaseServiceImpl() {
        this(new MockPurchaseDao());
    }

    ;

    public PurchaseServiceImpl(MockPurchaseDao daoPurchase) {
        this.daoPurchase = daoPurchase;
    }
    @Override
    public void addPurchase(Purchase purchase) {

        if (purchase.getAmount() >= 50.000) {
            LOG.log(Level.INFO, "Attention le montant est supérieur 50.000");
        }
        daoPurchase.insertPurchase(purchase);

    }

    @Override
    public void updatePurchaseStatus(Purchase purchase) {
        daoPurchase.updatePurchase(purchase);
    }
}
