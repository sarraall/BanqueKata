package com.models;

import com.utils.OperationType;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;


public class Operation {
    private   Date operationDate;
    private BigDecimal amount;
    private OperationType operationType;
    private Currency currency;

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
