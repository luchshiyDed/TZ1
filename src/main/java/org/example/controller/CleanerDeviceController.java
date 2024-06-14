package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.CleanerDevice;
import org.example.model.CleanerModel;
import org.example.sevice.CleanerDeviceService;
import org.example.sevice.CleanerModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/cleaner")
public class CleanerDeviceController {
    @Autowired
    private final CleanerModelService modelService;
    @Autowired
    private final CleanerDeviceService deviceService;

    @PostMapping("/device/create")
    public HttpStatus createDevice(@RequestBody CleanerDevice device) {
        return deviceService.createIfNotExists(device);
    }

    @PostMapping("/model/create/{device_id}")
    public HttpStatus createModel(@PathVariable Long deviceId, @RequestBody CleanerModel model) {
        return deviceService.addModel(deviceId, model);
    }

    @GetMapping("/device/country/{country}/{page}")
    public Page<CleanerDevice> getByCountry(@PathVariable String country, @PathVariable Integer page) {
        return  deviceService.getByCountry(country, page);
    }

    @GetMapping("/device/manufacture/{manufacture}/{page}")
    public Page<CleanerDevice> getByManufacture(@PathVariable String manufacture, @PathVariable Integer page) {
        return  deviceService.getByManufacture(manufacture, page);
    }

    @GetMapping("/model/color/{color}/{page}")
    public Page<CleanerModel> getByColor(@PathVariable String color, @PathVariable Integer page) {
        return  modelService.getByColor(color, page);
    }

    @GetMapping("/model/cost/{min}/{max}/{sort}/{page}")
    public Page<CleanerModel> getByCost(@PathVariable Integer min, Integer max, @PathVariable String sort, @PathVariable Integer page) {
        return  modelService.getByCost(min, max, page, Sort.by(sort));
    }

}
