package com.kevin.demo.domain.credit;

public class CreditFactory {
    private CreditFactory() {}

    public  static Credit createCredit(int userId, int actionCode){
        Credit credit = new Credit();

        int gainCredit = CreditAction.getCredit(actionCode);

        credit.setActionid(actionCode);
        credit.setUserid(userId);
        credit.setCreditnum(gainCredit);

        return credit;

    }
}
