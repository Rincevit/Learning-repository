package com.example.testing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {

        //given
        Account account = new Account();

        //then
        assertFalse(account.isActive(),"Check if new account is active");
    }

    @Test
    void accountShouldBeActiveAfterCreation() {

        //given
        Account account = new Account();

        //when
        account.activate();

        //then
        assertTrue(account.isActive());
    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet() {
        //given
        Account account = new Account();

        //when
        Address address = account.getDefaultDeliveryAddress();

        //then
        assertNull(address);
    }

}
