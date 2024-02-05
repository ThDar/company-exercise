/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package model;

import java.time.LocalDate;

public class Purchase {

    private int id;
    private int status;
    private int companyId;
    private String description;
    private double amount;
    private LocalDate issueDate;

    public Purchase(int id, int status, int companyId, String description, double amount, LocalDate issueDate) {
        this.id = id;
        this.status = status;
        this.companyId = companyId;
        this.description = description;
        this.amount = amount;
        this.issueDate = issueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public static class PurchaseBuilder{
        private int id;
        private int status;
        private int companyId;
        private String description;
        private double amount;
        private LocalDate issueDate;

        public Purchase createPurchase() {
            return new Purchase(id,status, companyId, description, amount, issueDate);
        }

        public PurchaseBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public PurchaseBuilder setStatus(int status) {
            this.status = status;
            return this;
        }
        public PurchaseBuilder setCompanyId(int companyId) {
            this.companyId = companyId;
            return this;
        }
        public PurchaseBuilder setDescription(String description) {
            this.description = description;
            return this;
        }
        public PurchaseBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }


        public PurchaseBuilder setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }
    }
}
