package com.example.person;

public class MyDevice {

        private Long userId;
        private Long deviceId;
        private boolean hidden;
        private int period;
        private int gpsId;
        private String company;

        public MyDevice(Long userId, Long deviceId, boolean hidden, int period, int gpsId, String company) {
            this.userId = userId;
            this.deviceId = deviceId;
            this.hidden = hidden;
            this.period = period;
            this.gpsId = gpsId;
            this.company = company;
        }

        public Long getUserId() { return userId; }
        public Long getDeviceId() { return deviceId; }
        public boolean isHidden() { return hidden; }
        public int getPeriod() { return period; }
        public int getGpsId() { return gpsId; }
        public String getCompany() { return company; }
    }


