package com.example.person;

public class MyDevice {

        private int gpsId;
        private String company;

        public MyDevice(int gpsId, String company) {
            this.gpsId = gpsId;
            this.company = company;
        }

        public int getGpsId() { return gpsId; }
        public String getCompany() { return company; }
    }


