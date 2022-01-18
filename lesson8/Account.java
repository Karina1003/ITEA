package com.karinapinchuk.lesson8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountID;
    private List<String> operationList = new ArrayList<>();

    public Account(String accountID) {
        this.accountID = accountID;
    }

    public String getListOfOperations(){
        StringBuilder strOperation = new StringBuilder("");
        for (String str:operationList) {
            strOperation.append(str+'\n');
        }
        return strOperation.toString();
    }

    public class Operation {

        public void moneyWithdrawal () {
            Account.this.operationList.add("Money was withdrawn at " + LocalDateTime.now());
        }

        public void moneyRefillment () {
            Account.this.operationList.add("Account was refilled at " + LocalDateTime.now());
        }

        public void payment () {
            Account.this.operationList.add("Payment was conducted at " + LocalDateTime.now());
        }
    }
}
