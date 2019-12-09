package com.services;

import com.exception.TechnicalException;
import com.models.UserAccount;

import java.math.BigDecimal;

import static com.utils.Consts.NOT_IMPLEMENTED;

public class OperationServiceImpl implements OperationService{
    public void deposit(BigDecimal amount, UserAccount user) throws TechnicalException {
        //TODO
        throw new TechnicalException(NOT_IMPLEMENTED);
    }

    public void withdrawal(BigDecimal amount, UserAccount user) throws TechnicalException{
        //TODO
        throw new TechnicalException(NOT_IMPLEMENTED);

    }

    @Override
    public void showHistory() throws TechnicalException {
        //TODO
        throw new TechnicalException(NOT_IMPLEMENTED);
    }


}
