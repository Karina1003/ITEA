package com.karinapinchuk.lesson8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Europe {
    private List<Country> countries = new ArrayList<>();

    public class Country {
        private String name;
        private List<String> changes = new ArrayList<>();

        public Country(String name) {
            this.name = name;
            countries.add(Country.this);
        }

        public String getName() {
            return name;
        }

        public List<String> getChanges() {
            return changes;
        }

        public void changeOfAdmDivision (String name, int year){
            String record = name + " " + year;
            changes.add(record + '\n');
        }

        @Override
        public String toString() {
            StringBuilder changesStr = new StringBuilder("");
            for (String str:changes) {
                changesStr.append(str);
            }
            return "Country: " + name + "\n" +
                    "Changes of administrative division: " + "\n" +
                    changesStr.toString();
        }
    }
    @Override
    public String toString() {
        StringBuilder countriesStr = new StringBuilder("");
        for (Country country:countries) {
            countriesStr.append(country).append('\n');
        }
        return countriesStr.toString();
    }
}
