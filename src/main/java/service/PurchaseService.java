/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package service;

import model.Purchase;

public interface PurchaseService {

   void addPurchase(Purchase purchase);
   void updatePurchaseStatus(Purchase purchase);
}
