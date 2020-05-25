package com.kevin.demo.service.impl;

import com.kevin.demo.BusinessException;
import com.kevin.demo.domain.credit.Credit;
import com.kevin.demo.domain.credit.CreditAction;
import com.kevin.demo.domain.credit.CreditFactory;
import com.kevin.demo.domain.credit.CreditRepository;
import com.kevin.demo.service.AppExceptionMessage;
import com.kevin.demo.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.List;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public List<Credit> creditList() {
        return creditRepository.selectAll();
    }

    @Override
    public int addCredit(int userId, int code) {
        boolean checkCodeRs = false;
        for (CreditAction ca : CreditAction.values()) {
            if (ca.getCode() == code) {
                checkCodeRs = true;
                break;
            }
        }
        if (checkCodeRs == false) {
            BusinessException.throwException(AppExceptionMessage.CREDIT_ACTION_NOT_EXIST_CODE, AppExceptionMessage.CREDIT_ACTION_NOT_EXIST, code);
        }

        Credit credit = CreditFactory.createCredit(userId, code);

        creditRepository.insert(credit);

        return credit.getId();
    }
}
