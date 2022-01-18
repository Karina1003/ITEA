package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
    private String brand;
    private List<PhoneModel> phones = new ArrayList<>();

    public Mobile(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public class PhoneModel {
        private String model;
        private List<Features> features = new ArrayList<>();

        public PhoneModel() {
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
            phones.add(PhoneModel.this);
        }

        public class Features {
            private String feature;

            public String getFeature() {
                return feature;
            }

            public void setFeature(String feature) {
                this.feature = feature;
                features.add(Features.this);
            }

            @Override
            public String toString() {
                return feature;
            }
        }

        @Override
        public String toString() {
            StringBuilder featuresStr = new StringBuilder("");
            for (Features str:features) {
                featuresStr.append("  ").append(str).append('\n');
            }
            return " Phone: " + model + "\n" +
                    "  Features: " + "\n" +
                    featuresStr.toString();
        }
    }
    @Override
    public String toString() {
        StringBuilder phoneStr = new StringBuilder("");
        for (PhoneModel str:phones) {
            phoneStr.append(str).append('\n');
        }
        return "Brand: " + brand + "\n" +
                phoneStr.toString();
    }
}
