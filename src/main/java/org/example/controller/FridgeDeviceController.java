package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.FridgeDevice;
import org.example.model.FridgeModel;
import org.example.sevice.FridgeDeviceService;
import org.example.sevice.FridgeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/fridge")
public class FridgeDeviceController {
    @Autowired
    private final FridgeModelService modelService;
    @Autowired
    private final FridgeDeviceService deviceService;
    @PostMapping("/device/create")
    public HttpStatus createDevice(@RequestBody FridgeDevice device) {
        return deviceService.createIfNotExists(device);
    }

    @PostMapping("/model/create/{device_id}")
    public HttpStatus createModel(@PathVariable Long deviceId, @RequestBody FridgeModel model) {
        return deviceService.addModel(deviceId, model);
    }

    @GetMapping("/device/country/{country}/{page}")
    public Page<FridgeDevice> getByCountry(@PathVariable String country, @PathVariable Integer page) {
        return  deviceService.getByCountry(country, page);
    }

    @GetMapping("/device/manufacture/{manufacture}/{page}")
    public Page<FridgeDevice> getByManufacture(@PathVariable String manufacture, @PathVariable Integer page) {
        return  deviceService.getByManufacture(manufacture, page);
    }

    @GetMapping("/model/color/{color}/{page}")
    public Page<FridgeModel> getByColor(@PathVariable String color, @PathVariable Integer page) {
        return  modelService.getByColor(color, page);
    }

    @GetMapping("/model/cost/{min}/{max}/{sort}/{page}")
    public Page<FridgeModel> getByCost(@PathVariable Integer min, Integer max, @PathVariable String sort, @PathVariable Integer page) {
        return  modelService.getByCost(min, max, page, Sort.by(sort));
    }
}
