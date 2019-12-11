package com;

import com.exception.FunctionalException;
import com.exception.TechnicalException;
import com.models.UserAccount;
import com.services.OperationServiceImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class OperationServiceTest {
    private UserAccount user;
    private OperationServiceImpl operationService;

    @Before
    public void setUp()  {
        // create a userAccount
        user = new UserAccount();
        user.setUserName("Test User");
        user.setAccountNumber(1);
        user.setBalance( new BigDecimal(200));

        // instantiate operationService
        operationService =  new OperationServiceImpl();
    }

    @Test
    public void withdrawalTest() {
        try {
            operationService.withdrawal(new BigDecimal(100), user);
            Assert.assertEquals(100, user.getBalance().longValue());
        } catch (TechnicalException | FunctionalException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void depositTest(){
        try {
            operationService.deposit(new BigDecimal(100), user);
            Assert.assertEquals(300, user.getBalance().longValue());
        } catch (TechnicalException | FunctionalException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void showHistoryTest()  {
        try {
            operationService.deposit(new BigDecimal(30), user);
            operationService.deposit(new BigDecimal(70), user);
            operationService.withdrawal(new BigDecimal(80), user);
            operationService.showHistory(user);
            Assert.assertEquals(220, user.getBalance().longValue());
        } catch (TechnicalException | FunctionalException e){
            System.out.println(e.getMessage());
        }
    }
}
