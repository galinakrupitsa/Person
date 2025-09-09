package com.example.person;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String registerDevice(String userId,
                                         String deviceId,
                                         Boolean hidden,
                                         int period,
                                         MyDevice myDevice) {

        // Здесь могла бы быть логика сохранения в БД или проверки параметров
        return "UserId: %s, gps: %d".formatted(userId, myDevice.getGpsId());
    }

}
