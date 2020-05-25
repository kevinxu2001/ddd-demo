package com.kevin.demo.service;

import com.kevin.demo.domain.credit.Credit;

import java.util.List;

public interface CreditService {

    List<Credit> creditList();

    int addCredit(int userId, int code);

}
