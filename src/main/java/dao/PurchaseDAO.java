/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package dao;

import java.sql.Connection;

import model.Purchase;

public class PurchaseDAO {
    void insertPurchase(Connection conn, Purchase purchase) {
       /* JooqDSL.using(conn)
                .insertInto(PURCHASE)
                .set(PURCHASE.status,purchase.getStatus())
                .set(PURCHASE.companyId, purchase.getCompanyId())
                .set(PURCHASE.description, purchase.getDescription())
                .set(PURCHASE.amount, purchase.getAmount())
                .set(PURCHASE.issueDate, purchase.getIssueDate())
                .execute();*/
    }

    void updatePurchase(Connection conn, Purchase purchase) {
       /* JooqDSL.using(conn)
                .update(PURCHASE)
                .set(PURCHASE.status,purchase.getStatus())
                .where(PURCHASE.id.eq(purchase.getId()))
                .execute();*/
    }
}
