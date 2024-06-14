package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.ComputerDevice;
import org.example.model.ComputerModel;
import org.example.sevice.ComputerDeviceService;
import org.example.sevice.ComputerModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/computer")
public class ComputerDeviceController {
    @Autowired
    private final ComputerModelService modelService;
    @Autowired
    private final ComputerDeviceService deviceService;

    @PostMapping("/device/create")
    public HttpStatus createDevice(@RequestBody ComputerDevice device) {
        return deviceService.createIfNotExists(device);
    }

    @PostMapping("/model/create/{device_id}")
    public HttpStatus createModel(@PathVariable Long deviceId, @RequestBody ComputerModel model) {
        return deviceService.addModel(deviceId, model);
    }

    @GetMapping("/device/country/{country}/{page}")
    public Page<ComputerDevice> getByCountry(@PathVariable String country, @PathVariable Integer page) {
        return  deviceService.getByCountry(country, page);
    }

    @GetMapping("/device/manufacture/{manufacture}/{page}")
    public Page<ComputerDevice> getByManufacture(@PathVariable String manufacture, @PathVariable Integer page) {
        return  deviceService.getByManufacture(manufacture, page);
    }

    @GetMapping("/model/color/{color}/{page}")
    public Page<ComputerModel> getByColor(@PathVariable String color, @PathVariable Integer page) {
        return  modelService.getByColor(color, page);
    }

    @GetMapping("/model/cost/{min}/{max}/{sort}/{page}")
    public Page<ComputerModel> getByCost(@PathVariable Integer min, Integer max, @PathVariable String sort, @PathVariable Integer page) {
        return  modelService.getByCost(min, max, page, Sort.by(sort));
    }
}
