package com.musdon.thejavaacademybank.service.impl;

import com.musdon.thejavaacademybank.dto.BankResponse;
import com.musdon.thejavaacademybank.dto.CreditDebitRequest;
import com.musdon.thejavaacademybank.dto.EnquiryRequest;
import com.musdon.thejavaacademybank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
