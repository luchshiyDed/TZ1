package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.*;
import org.example.sevice.PhoneDeviceService;
import org.example.sevice.PhoneModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/phone")
public class PhoneDeviceController {
    @Autowired
    private final PhoneModelService modelService;
    @Autowired
    private final PhoneDeviceService deviceService;
    @PostMapping("/device/create")
    public HttpStatus createDevice(@RequestBody PhoneDevice device) {
        return deviceService.createIfNotExists(device);
    }

    @PostMapping("/model/create/{device_id}")
    public HttpStatus createModel(@PathVariable Long deviceId, @RequestBody PhoneModel model) {
        return deviceService.addModel(deviceId, model);
    }

    @GetMapping("/device/country/{country}/{page}")
    public Page<PhoneDevice> getByCountry(@PathVariable String country, @PathVariable Integer page) {
        return  deviceService.getByCountry(country, page);
    }

    @GetMapping("/device/manufacture/{manufacture}/{page}")
    public Page<PhoneDevice> getByManufacture(@PathVariable String manufacture, @PathVariable Integer page) {
        return  deviceService.getByManufacture(manufacture, page);
    }

    @GetMapping("/model/color/{color}/{page}")
    public Page<PhoneModel> getByColor(@PathVariable String color, @PathVariable Integer page) {
        return  modelService.getByColor(color, page);
    }

    @GetMapping("/model/cost/{min}/{max}/{sort}/{page}")
    public Page<PhoneModel> getByCost(@PathVariable Integer min, Integer max, @PathVariable String sort, @PathVariable Integer page) {
        return  modelService.getByCost(min, max, page, Sort.by(sort));
    }
    @GetMapping("/model/memory/{memory}/{page}")
    public Page<PhoneModel> getByMemory(@PathVariable String memory, @PathVariable Integer page){
        return modelService.getByMemory(memory,page);
    }
    @GetMapping("/model/camerasCnt/{camerasCnt}/{page}")
    public Page<PhoneModel> getByCameras(@PathVariable Integer camerasCnt,@PathVariable Integer page){
        return modelService.getByCamerasCnt(camerasCnt,page);
    }
}