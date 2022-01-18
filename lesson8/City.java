package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Infrastructure> infrastrObjects = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public class Infrastructure {
        private String name;

        public class Street extends Infrastructure {
            public Street(String name) {
                Infrastructure.this.name = name;
                infrastrObjects.add(Street.this);
            }
            @Override
            public String toString() {
                return "street " + Infrastructure.this.name;
            }
        }
        public class Square extends Infrastructure {
            public Square(String name) {
                Infrastructure.this.name = name;
                infrastrObjects.add(Square.this);
            }
            @Override
            public String toString() {
                return "square " + Infrastructure.this.name;
            }
        }
        public class Boulevard extends Infrastructure {
            public Boulevard(String name) {
                Infrastructure.this.name = name;
                infrastrObjects.add(Boulevard.this);
            }
            @Override
            public String toString() {
                return "boulevard " + Infrastructure.this.name;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder cityStr = new StringBuilder("");
        for (Infrastructure str:infrastrObjects) {
            cityStr.append(str).append('\n');
        }
        return "City: " + name + "\n" +
                cityStr.toString();
    }
}
