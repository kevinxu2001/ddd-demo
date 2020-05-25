package com.kevin.demo.domain.credit;

public enum CreditAction {
    CHECK_IN(1, "签到", 10),
    REGISTER(2, "注册", 1000);

    CreditAction(int code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }


    public static int getCredit(int code){
        for(CreditAction ca : CreditAction.values()){
            if(ca.getCode() == code){
                return ca.credit;
            }
        }
        return 0;
    }



    private int code;
    private String name;
    private int credit;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }


}
