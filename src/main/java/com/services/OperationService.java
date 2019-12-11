package com.services;

import com.exception.FunctionalException;
import com.exception.TechnicalException;
import com.models.UserAccount;

import java.math.BigDecimal;

public interface OperationService {
    void deposit(BigDecimal amount, UserAccount user) throws TechnicalException, FunctionalException;
    void withdrawal(BigDecimal amount, UserAccount user) throws TechnicalException, FunctionalException;
    void showHistory (UserAccount user) throws TechnicalException;
}
