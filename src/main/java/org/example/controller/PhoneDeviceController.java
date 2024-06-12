package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.sevice.PhoneDeviceService;
import org.example.sevice.PhoneModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/phone")
public class PhoneDeviceController {
    @Autowired
    private final PhoneModelService modelService;
    @Autowired
    private final PhoneDeviceService deviceService;
}