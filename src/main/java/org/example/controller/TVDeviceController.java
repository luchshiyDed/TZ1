package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.CleanerModel;
import org.example.model.TVDevice;
import org.example.model.TVModel;
import org.example.sevice.TVDeviceService;
import org.example.sevice.TVModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/device/tv")
public class TVDeviceController {
    @Autowired
    private final TVModelService modelService;
    @Autowired
    private final TVDeviceService deviceService;
    @PostMapping("/device/create")
    public HttpStatus createDevice(@RequestBody TVDevice device) {
        return deviceService.createIfNotExists(device);
    }

    @PostMapping("/model/create/{device_id}")
    public HttpStatus createModel(@PathVariable Long deviceId, @RequestBody TVModel model) {
        return deviceService.addModel(deviceId, model);
    }

    @GetMapping("/device/country/{country}/{page}")
    public Page<TVDevice> getByCountry(@PathVariable String country, @PathVariable Integer page) {
        return  deviceService.getByCountry(country, page);
    }

    @GetMapping("/device/manufacture/{manufacture}/{page}")
    public Page<TVDevice> getByManufacture(@PathVariable String manufacture, @PathVariable Integer page) {
        return  deviceService.getByManufacture(manufacture, page);
    }

    @GetMapping("/model/color/{color}/{page}")
    public Page<TVModel> getByColor(@PathVariable String color, @PathVariable Integer page) {
        return  modelService.getByColor(color, page);
    }

    @GetMapping("/model/cost/{min}/{max}/{sort}/{page}")
    public Page<TVModel> getByCost(@PathVariable Integer min, Integer max, @PathVariable String sort, @PathVariable Integer page) {
        return  modelService.getByCost(min, max, page, Sort.by(sort));
    }
    @GetMapping("/model/category/{category}/{page}")
    public Page<TVModel> getByCategory(@PathVariable String category, @PathVariable Integer page){
        return modelService.getByCategory(category,page);
    }
    @GetMapping("/model/technology/{technology}/{page}")
    public Page<TVModel> getByTechnology(@PathVariable String technology,@PathVariable Integer page){
        return modelService.getByTechnology(technology,page);
    }
}
