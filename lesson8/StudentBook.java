package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class StudentBook {
    private String studentBookID;
    private List<Session> sessionList = new ArrayList<>();

    public StudentBook(String studentBookID) {
        this.studentBookID = studentBookID;
    }

    public String getStudentBookID() {
        return studentBookID;
    }

    public class Session {
        private String sessionID;
        private int year;
        private List<String> creditList = new ArrayList<>();
        private List<String> examList = new ArrayList<>();

        public Session(String sessionID, int year) {
            sessionList.add(Session.this);
            this.sessionID = sessionID;
            this.year = year;
        }

        public String getSessionID() {
            return sessionID;
        }

        public int getYear() {
            return year;
        }

        public List<String> getCreditList() {
            return creditList;
        }

        public List<String> getExamList() {
            return examList;
        }

        public class Exam {
            private String exam;

            public Exam(String exam) {
                this.exam = exam;
                examList.add(exam);
            }
        }

        public class Credit {
            private String credit;

            public Credit(String credit) {
                this.credit = credit;
                creditList.add(credit);
            }
        }

        @Override
        public String toString() {
            return "sessionID - '" + sessionID + '\'' +
                   ", year=" + year +
                   ", creditList=" + creditList +
                   ", examList=" + examList;
        }
    }

    @Override
    public String toString() {
        StringBuilder sessionsStr = new StringBuilder("");
        for (Session session:sessionList) {
            sessionsStr.append(session).append('\n');
        }
            return "StudentBookID: '" + studentBookID + "' \n" +
                   "Sessions: " + "\n" +
                    sessionsStr.toString();
    }
}
