package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.sevice.TVDeviceService;
import org.example.sevice.TVModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/tv")
public class TVDeviceController {
    @Autowired
    private final TVModelService modelService;
    @Autowired
    private final TVDeviceService deviceService;
}
