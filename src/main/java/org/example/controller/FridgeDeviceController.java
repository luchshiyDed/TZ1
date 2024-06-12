package org.example.controller;

import lombok.RequiredArgsConstructor;

import org.example.sevice.FridgeDeviceService;
import org.example.sevice.FridgeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/fridge")
public class FridgeDeviceController {
    @Autowired
    private final FridgeModelService modelService;
    @Autowired
    private final FridgeDeviceService deviceService;
}
