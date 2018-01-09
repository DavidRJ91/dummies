package com.iesemilidarder.fordummies.core;

public class Users extends DBObject {

        private int id;
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        protected void beforeSave() {
            doLog (String.format("Saving %s", this.getClass().getCanonicalName()));
            System.out.println();
        }

    }


