package com.services;

import com.exception.TechnicalException;
import com.models.UserAccount;

import java.math.BigDecimal;

public interface OperationService {
    void deposit(BigDecimal amount, UserAccount user) throws TechnicalException;
    void withdrawal(BigDecimal amount, UserAccount user)  throws TechnicalException;
    void showHistory () throws TechnicalException;
}
