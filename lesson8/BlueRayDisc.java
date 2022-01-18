package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class BlueRayDisc {
    private String discName;
    private List<Catalog1> catalogs = new ArrayList<>();

    public BlueRayDisc(String discName) {
        this.discName = discName;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public class Catalog1 {
        private String name;

        public Catalog1() {
        }

        public Catalog1(String name) {
            this.name = name;
            catalogs.add(Catalog1.this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            catalogs.add(Catalog1.this);
        }

        @Override
        public String toString() {
            return "catalog " + Catalog1.this.name;
        }

        public class Subcatalog extends Catalog1{
            public Subcatalog() {
            }

            public Subcatalog(String name) {
                Catalog1.this.name = name;
                catalogs.add(Subcatalog.this);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                Catalog1.this.name = name;
                catalogs.add(Subcatalog.this);
            }

            @Override
            public String toString() {
                return "subcatalog " + name;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder catalogStr = new StringBuilder("");
        for (Catalog1 str:catalogs) {
            catalogStr.append(str).append('\n');
        }
        return "Disc: " + discName + '\n' +
                catalogStr.toString();
    }
}
