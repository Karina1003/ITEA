package com.karinapinchuk.lesson8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> bookList = new ArrayList<>();

    public class Book {
        private String name;
        private String reader;
        private List<String> readersList = new ArrayList<>();

        public Book(String name) {
            this.name = name;
            bookList.add(Book.this);
        }

        public String getName() {
            return name;
        }

        public String getReader() {
            return reader;
        }

        public void setReader(String reader) {
            this.reader = reader;
            readersList.add(reader + " " + LocalDate.now());
        }

        public List<String> getReadersList() {
            return readersList;
        }

        @Override
        public String toString() {
            StringBuilder readerStr = new StringBuilder("");
            for (String str:readersList) {
                readerStr.append(str+'\n');
            }
            return "Book: " + name + "\n" +
                   "Readers: " + "\n" +
                    readerStr.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder bookStr = new StringBuilder("");
        for (Book book:bookList) {
            bookStr.append(book).append('\n');
        }
        return "Catalog: " + "\n" +
                bookStr.toString();
    }
}
