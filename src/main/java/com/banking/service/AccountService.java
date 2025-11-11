package com.banking.service;

import com.banking.dto.AccountDto;
import com.banking.dto.TransactionDto;
import com.banking.dto.TransferFundDto;
import com.banking.service.impl.AccountServiceImpl;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountTransactions(Long accountId);

}
