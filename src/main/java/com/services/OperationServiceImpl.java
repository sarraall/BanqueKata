package com.services;

import com.exception.FunctionalException;
import com.exception.TechnicalException;
import com.models.Operation;
import com.models.UserAccount;
import com.utils.OperationType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static com.utils.Consts.*;

public class OperationServiceImpl implements OperationService{
    public void deposit(BigDecimal amount, UserAccount userAccount) throws TechnicalException, FunctionalException {
        if(userAccount != null) {
            BigDecimal currentUserBalance = userAccount.getBalance();
            BigDecimal balance = currentUserBalance != null ? currentUserBalance:BigDecimal.ZERO;
            if(amount != null && amount.compareTo(BigDecimal.ZERO) == 1) {
                userAccount.setBalance(balance.add(amount));
                Operation op = createOperation(amount, OperationType.DEPOSIT);
                userAccount.getOperations().add(op);
            }else {
                throw new FunctionalException(ADD_POSITIVE_AMOUNT);
            }
        }else{
            throw new TechnicalException(USER_ACCOUNT_NULL);
        }
    }

    public void withdrawal(BigDecimal amount, UserAccount userAccount) throws TechnicalException, FunctionalException {
        if(userAccount != null) {
            if(amount != null && amount.compareTo(BigDecimal.ZERO) == 1) {
                BigDecimal currentUserBalance = userAccount.getBalance();
                BigDecimal balance = currentUserBalance != null ? currentUserBalance:BigDecimal.ZERO;
                if(balance.compareTo(amount) == 1) {
                    userAccount.setBalance(balance.subtract(amount));
                    Operation op = createOperation(amount, OperationType.WITHDRAWAL);
                    userAccount.getOperations().add(op);
                }else{
                    throw new FunctionalException(NOT_ENOUGH_MONEY);
                }
            }else {
                throw new FunctionalException(ADD_POSITIVE_AMOUNT);
            }
        }else{
            throw new TechnicalException(USER_ACCOUNT_NULL);
        }
    }

    @Override
    public void showHistory(UserAccount userAccount) throws TechnicalException {
        if(userAccount != null ) {
            System.out.println(" Name :" + userAccount.getUserName() + ", Number :"
                    + userAccount.getAccountNumber() + ", Balance :" + userAccount.getBalance());
            List<Operation> ops = userAccount.getOperations();
            if ( ops!= null && !ops.isEmpty()) {
                for( Operation op : ops){
                    System.out.println( op.getOperationType()+ " " +op.getAmount() + " " + op.getOperationDate()+ " " );
                }
            }
        }else{
            throw new TechnicalException(USER_ACCOUNT_NULL);
        }
    }

    private Operation createOperation(BigDecimal amount, OperationType operationType){
        Operation op = new Operation();
        op.setAmount(amount);
        op.setOperationDate(new Date());
        op.setOperationType(operationType);
        return  op;
    }


}
