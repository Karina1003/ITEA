package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private String paymentID;
    private List<String> purchaseList = new ArrayList<>();

    public Payment(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getListOfPurchases(){
        StringBuilder strPurchase = new StringBuilder("");
        for (String str:purchaseList) {
            strPurchase.append(str+'\n');
        }
        return strPurchase.toString();
    }

    public class Purchase {
        private String nameOfPurchase;

        public Purchase(String nameOfPurchase) {
            this.nameOfPurchase = nameOfPurchase;
            purchaseList.add(nameOfPurchase);
        }

        public String getNameOfPurchase() {
            return nameOfPurchase;
        }

        @Override
        public String toString() {
            return "Purchase{" +
                    "nameOfPurchase='" + nameOfPurchase + '\'' +
                    '}';
        }
    }
}
