package com.example.person;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class MyController {
    private final MyService myService;
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/{userId}/device/{deviceId}")
    public String addDevice(@PathVariable String userId,
                            @PathVariable String deviceId,
                            @RequestParam boolean isHidden,
                            @RequestParam int period,
                            @RequestParam int gpsId,
                            @RequestParam String company) {
        return myService.myMethod();
    }
}
