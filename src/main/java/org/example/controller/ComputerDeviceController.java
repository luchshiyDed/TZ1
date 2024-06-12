package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.sevice.ComputerDeviceService;
import org.example.sevice.ComputerModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/computer")
public class ComputerDeviceController {
    @Autowired
    private final ComputerModelService modelService;
    @Autowired
    private final ComputerDeviceService deviceService;

}
