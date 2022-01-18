package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Notepad {
    private GregorianCalendar date;
    private List<String> recordList = new ArrayList<>();

    public Notepad(GregorianCalendar date) {
        this.date = date;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public String getListOfRecords(){
        StringBuilder strRecords = new StringBuilder("");
        for (String str:recordList) {
            strRecords.append(str+'\n');
        }
        return strRecords.toString();
    }

    public class Records {
        private String record;
        Records(String record) {
            this.record = record;
            recordList.add(record);
        }

        public String getRecord() {
            return record;
        }

        @Override
        public String toString() {
            return "Records{" +
                    ", record='" + record + '\'' +
                    '}';
        }
    }
}
